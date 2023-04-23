package com.back_blind_box_anytime.service;

import com.back_blind_box_anytime.entity.Probability;

import java.util.List;

/**
 * (Probability)表服务接口
 *
 * @author makejava
 * @since 2023-04-23 22:07:03
 */
public interface ProbabilityService {

    /**
     * 通过seriesId查询单条数据
     *
     * @param seriesId 主键
     * @return 实例对象
     */
    Probability queryBySeriesId(Integer seriesId);

    /**
     * 通过ID查询单条数据
     *
     * @param probabilityId 主键
     * @return 实例对象
     */
    Probability queryById(Integer probabilityId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Probability> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param probability 实例对象
     * @return 实例对象
     */
    Probability insert(Probability probability);

    /**
     * 修改数据
     *
     * @param probability 实例对象
     * @return 实例对象
     */
    Probability update(Probability probability);

    /**
     * 通过主键删除数据
     *
     * @param probabilityId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer probabilityId);

}
