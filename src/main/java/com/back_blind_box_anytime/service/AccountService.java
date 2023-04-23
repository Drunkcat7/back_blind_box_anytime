package com.back_blind_box_anytime.service;

import com.back_blind_box_anytime.entity.Account;
import com.back_blind_box_anytime.entity.Goods;

import java.util.List;
import java.util.Map;

/**
 * (Account)表服务接口
 *
 * @author makejava
 * @since 2023-04-23 11:37:18
 */
public interface AccountService {
    /**
     *  抽奖
     * @param uid
     */
    Goods luckyDraw(Integer seriesId, Integer uid);



    /**
     * 新增数据
     *
     * @param account 实例对象
     * @return 实例对象
     */
    Account insert(Account account);

    /**
     * 用户登录
     * @param user
     * @param password
     * @return 登录的对象
     */
    Map<String,Object> login(String user, String password);

    /**
     * 查询用户信息
     * @param uid
     * @return
     */
    Map<String, Object> queryUserInfo(Integer uid);

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    Account queryById(Integer uid);

    /**
     * 充值
     * @param diamond
     * @param uid
     * @return
     */
    Boolean topUp(Double diamond,Integer uid);

    /** ——————-——-——-——分界线——-——————--——--*/


    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Account> queryAllByLimit(int offset, int limit);


    /**
     * 修改数据
     *
     * @param account 实例对象
     * @return 实例对象
     */
    Account update(Account account);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer uid);

}
