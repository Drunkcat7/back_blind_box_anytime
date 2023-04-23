package com.back_blind_box_anytime.service;

import com.back_blind_box_anytime.entity.Series;

import java.util.List;

/**
 * (Series)表服务接口
 *
 * @author makejava
 * @since 2023-04-23 14:09:05
 */
public interface SeriesService {




    /**
     * 通过实体作为筛选条件查询
     *
     * @param series 实例对象
     * @return 对象列表
     */
    List<Series> queryAll(Series series);

    /**     -------分界线--------------     */
    /**
     * 通过ID查询单条数据
     *
     * @param seriesId 主键
     * @return 实例对象
     */
    Series queryById(Integer seriesId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Series> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param series 实例对象
     * @return 实例对象
     */
    Series insert(Series series);

    /**
     * 修改数据
     *
     * @param series 实例对象
     * @return 实例对象
     */
    Series update(Series series);

    /**
     * 通过主键删除数据
     *
     * @param seriesId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer seriesId);

}
