package com.back_blind_box_anytime.service.impl;

import com.back_blind_box_anytime.entity.Account;
import com.back_blind_box_anytime.dao.AccountDao;
import com.back_blind_box_anytime.service.AccountService;
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
