package com.back_blind_box_anytime.service.impl;

import com.back_blind_box_anytime.dao.AccountDao;
import com.back_blind_box_anytime.dao.SeriesDao;
import com.back_blind_box_anytime.entity.Account;
import com.back_blind_box_anytime.entity.HitGoods;
import com.back_blind_box_anytime.entity.Mybox;
import com.back_blind_box_anytime.dao.MyboxDao;
import com.back_blind_box_anytime.entity.Series;
import com.back_blind_box_anytime.service.MyboxService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Mybox)表服务实现类
 *
 * @author makejava
 * @since 2023-04-23 22:58:34
 */
@Service("myboxService")
public class MyboxServiceImpl implements MyboxService {
    @Resource
    private MyboxDao myboxDao;
    @Resource
    private SeriesDao seriesDao;
    @Resource
    private AccountDao accountDao;

    @Override
    public int insertOrder(Mybox mybox) {
        return this.myboxDao.insertOrder(mybox);
    }

    /**
     * 查询最新中奖3条数据
     *
     * @param uid
     * @return
     */
    @Override
    public List<String> queryNewGoods(Integer uid) {
        return this.myboxDao.queryNewGoods(uid);
    }

    /**
     * 我抽中的所有盲盒
     *
     * @param uid
     * @return
     */
    @Override
    public List<Map<String, Object>> selectAll(Integer uid) {
        List<Map<String, Object>> selectAll = new ArrayList<>();
        List<Series> seriesList = this.seriesDao.queryHit(uid);
        for (Series series : seriesList) {
            Map<String, Object> map = new HashMap<>();
            map.put("seriesId", series.getSeriesId());
            map.put("seriesName", series.getSeriesName());
            map.put("goods", this.myboxDao.querySeriesGoods(uid, series.getSeriesId()));
            selectAll.add(map);
        }
        return selectAll;
    }

    /**
     * 反盒
     *
     * @param myboxId
     * @return
     */
    @Override
    public Boolean backGoods(Integer myboxId, Integer uid) {
        this.myboxDao.updateStatus(myboxId, 1);
        Integer recoveryPrice = this.myboxDao.getRecoveryPrice(myboxId);
        Account account = new Account();
        account.setDiamond(Double.valueOf(recoveryPrice));
        account.setUid(uid);
        accountDao.topUp(account);
        return true;
    }

    /**
     * 购入
     *
     * @param myboxId
     * @return
     */
    @Override
    public Boolean buy(Integer myboxId) {
        int i = this.myboxDao.updateStatus(myboxId, 2);
        return i != 0;
    }


    /**
     * 通过ID查询单条数据
     *
     * @param myboxId 主键
     * @return 实例对象
     */
    @Override
    public Mybox queryById(Integer myboxId) {
        return this.myboxDao.queryById(myboxId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Mybox> queryAllByLimit(int offset, int limit) {
        return this.myboxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param mybox 实例对象
     * @return 实例对象
     */
    @Override
    public Mybox insert(Mybox mybox) {
        this.myboxDao.insert(mybox);
        return mybox;
    }

    /**
     * 修改数据
     *
     * @param mybox 实例对象
     * @return 实例对象
     */
    @Override
    public Mybox update(Mybox mybox) {
        this.myboxDao.update(mybox);
        return this.queryById(mybox.getMyboxId());
    }

    /**
     * 通过主键删除数据
     *
     * @param myboxId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer myboxId) {
        return this.myboxDao.deleteById(myboxId) > 0;
    }
}
