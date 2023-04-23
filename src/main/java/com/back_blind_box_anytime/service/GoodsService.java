package com.back_blind_box_anytime.service;

import com.back_blind_box_anytime.entity.Goods;

import java.util.List;

/**
 * (Goods)表服务接口
 *
 * @author makejava
 * @since 2023-04-23 15:42:29
 */
public interface GoodsService {

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
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Goods> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param goods 实例对象
     * @return 实例对象
     */
    Goods insert(Goods goods);

    /**
     * 修改数据
     *
     * @param goods 实例对象
     * @return 实例对象
     */
    Goods update(Goods goods);

    /**
     * 通过主键删除数据
     *
     * @param goodsId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer goodsId);

}
