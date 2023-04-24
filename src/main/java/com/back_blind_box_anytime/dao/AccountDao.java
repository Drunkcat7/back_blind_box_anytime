package com.back_blind_box_anytime.dao;

import com.back_blind_box_anytime.entity.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Account)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-23 11:36:34
 */
public interface AccountDao {




    /**
     * 新增数据
     *
     * @param account 实例对象
     * @return 影响行数
     */
    int insert(Account account);

    /**
     * 用户登录
     * @param user
     * @param password
     * @return
     */
    Account login(@Param("user") String user, @Param("password") String password);


/** _______-----_--_-分界线_--_----_-__-_---_-_*/

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    Account queryById(Integer uid);




    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Account> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param account 实例对象
     * @return 对象列表
     */
    List<Account> queryAll(Account account);

    /**
     * 充钱
     *
     * @param account 实例对象
     * @return 影响行数
     */
    int topUp(Account account);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Account> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Account> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Account> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Account> entities);

    /**
     * 修改数据
     *
     * @param account 实例对象
     * @return 影响行数
     */
    int update(Account account);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 影响行数
     */
    int deleteById(Integer uid);

}

