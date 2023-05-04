package com.back_blind_box_anytime.dao;

import com.back_blind_box_anytime.entity.HitGoods;
import com.back_blind_box_anytime.entity.Mybox;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Mybox)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-23 22:58:34
 */
public interface MyboxDao {

    /**
     * 插入订单
     *
     * @param mybox
     * @return
     */
    int insertOrder(Mybox mybox);

    List<String> queryNewGoods(@Param("uid") Integer uid);

    List<HitGoods> querySeriesGoods(@Param("uid") Integer uid, @Param("seriesId") Integer seriesId);

    /**
     * 修改订单数据
     *
     * @param myboxId
     * @param status
     * @return
     */
    int updateStatus(@Param("myboxId") Integer myboxId, @Param("status") Integer status);

    /**
     * 检查是否购买过该商品
     *
     * @param uid
     * @param seriesId
     * @return
     */
    Integer checkIsBuy(@Param(("uid")) Integer uid, @Param("seriesId") Integer seriesId);
    /**-----分割线-------------*/

    /**
     * 通过ID查询单条数据
     *
     * @param myboxId 主键
     * @return 实例对象
     */
    Mybox queryById(Integer myboxId);

    Integer getRecoveryPrice(Integer myboxId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Mybox> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param mybox 实例对象
     * @return 对象列表
     */
    List<Mybox> queryAll(Mybox mybox);

    /**
     * 新增数据
     *
     * @param mybox 实例对象
     * @return 影响行数
     */
    int insert(Mybox mybox);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Mybox> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Mybox> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Mybox> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Mybox> entities);

    /**
     * 修改数据
     *
     * @param mybox 实例对象
     * @return 影响行数
     */
    int update(Mybox mybox);

    /**
     * 通过主键删除数据
     *
     * @param myboxId 主键
     * @return 影响行数
     */
    int deleteById(Integer myboxId);

}

