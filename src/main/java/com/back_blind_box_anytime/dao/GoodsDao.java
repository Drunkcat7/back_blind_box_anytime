package com.back_blind_box_anytime.dao;

import com.back_blind_box_anytime.entity.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Goods)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-23 15:42:29
 */
public interface GoodsDao {


    /**
     * 通过seriesId查询多条数据
     *
     * @param seriesId 外键
     * @return 对象列表
     */
    List<Goods> queryBySeriesId(Integer seriesId);

    /** -------------分界线----------*/



    /**
     * 通过ID查询单条数据
     *
     * @param goodsId 主键
     * @return 实例对象
     */
    Goods queryById(Integer goodsId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Goods> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param goods 实例对象
     * @return 对象列表
     */
    List<Goods> queryAll(Goods goods);

    /**
     * 新增数据
     *
     * @param goods 实例对象
     * @return 影响行数
     */
    int insert(Goods goods);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Goods> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Goods> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Goods> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Goods> entities);

    /**
     * 修改数据
     *
     * @param goods 实例对象
     * @return 影响行数
     */
    int update(Goods goods);

    /**
     * 通过主键删除数据
     *
     * @param goodsId 主键
     * @return 影响行数
     */
    int deleteById(Integer goodsId);

}

