package com.back_blind_box_anytime.service.impl;

import com.back_blind_box_anytime.dao.GoodsDao;
import com.back_blind_box_anytime.dao.SeriesDao;
import com.back_blind_box_anytime.entity.Account;
import com.back_blind_box_anytime.dao.AccountDao;
import com.back_blind_box_anytime.entity.Goods;
import com.back_blind_box_anytime.entity.Series;
import com.back_blind_box_anytime.service.AccountService;
import com.back_blind_box_anytime.service.SeriesService;
import com.back_blind_box_anytime.tools.JwtUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Account)表服务实现类
 *
 * @author makejava
 * @since 2023-04-23 11:50:46
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountDao accountDao;
    @Resource
    private SeriesDao seriesDao;
    @Resource
    private GoodsDao goodsDao;



    public boolean luckyDraw(Integer seriesId,Integer uid){
        Account user = this.accountDao.queryById(uid);
        Series series = this.seriesDao.queryById(seriesId);
        if(user.getDiamond() < series.getPrice()){
            // 如果用户钱包的钱 少于售价
            System.out.println("老哥！钱包的钱不够啊～");
            return false;
        }
//        买商品，扣钱
        user.setDiamond(user.getDiamond() - series.getPrice());
        this.accountDao.update(user);

//        获取商品数据
        List<Goods> goodsList = this.goodsDao.queryBySeriesId(seriesId);
        // 商品总数 、 商品隐藏款数量
        int total = goodsList.size();
        int rareNum = 0;

        for (Goods goods : goodsList) {
            if (goods.getRare() == 1) {
                rareNum++;
            }
        }





        return true;
    }

    /**
     * 新增数据
     *
     * @param account 实例对象
     * @return 实例对象
     */
    @Override
    public Account insert(Account account) {
        this.accountDao.insert(account);
        return account;
    }

    /**
     * 用户登录
     *
     * @param user
     * @param password
     * @return 登录成功的用户
     */
    @Override
    public Map<String, Object> login(String user, String password) {
        Map<String, Object> map = new HashMap<>();
        Account loginUser = this.accountDao.login(user, password);
        if (loginUser == null) return null;
        map.put("uid", loginUser.getUid());
        map.put("user", loginUser.getUser());
        //登录成功生成token
        String token = JwtUtil.getJwtToken(loginUser.getUid(), loginUser.getUser());
        map.put("token", token);
        return map;
    }



    /** =-------- 分界线---------------------=*/


    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public Account queryById(Integer uid) {
        return this.accountDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Account> queryAllByLimit(int offset, int limit) {
        return this.accountDao.queryAllByLimit(offset, limit);
    }



    /**
     * 修改数据
     *
     * @param account 实例对象
     * @return 实例对象
     */
    @Override
    public Account update(Account account) {
        this.accountDao.update(account);
        return this.queryById(account.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer uid) {
        return this.accountDao.deleteById(uid) > 0;
    }
}
