package com.back_blind_box_anytime.dao;

import com.back_blind_box_anytime.entity.Series;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Series)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-23 14:09:05
 */
public interface SeriesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param seriesId 主键
     * @return 实例对象
     */
    Series queryById(Integer seriesId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Series> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param series 实例对象
     * @return 对象列表
     */
    List<Series> queryAll(Series series);

    /**
     * 新增数据
     *
     * @param series 实例对象
     * @return 影响行数
     */
    int insert(Series series);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Series> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Series> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Series> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Series> entities);

    /**
     * 修改数据
     *
     * @param series 实例对象
     * @return 影响行数
     */
    int update(Series series);

    /**
     * 通过主键删除数据
     *
     * @param seriesId 主键
     * @return 影响行数
     */
    int deleteById(Integer seriesId);

}

