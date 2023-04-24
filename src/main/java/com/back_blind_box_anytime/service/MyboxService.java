package com.back_blind_box_anytime.service;

import com.back_blind_box_anytime.entity.Mybox;

import java.util.List;

/**
 * (Mybox)表服务接口
 *
 * @author makejava
 * @since 2023-04-23 22:58:34
 */
public interface MyboxService {
    /**
     * 插入订单
     *
     * @param mybox
     * @return
     */
    int insertOrder(Mybox mybox);

    List<String> queryNewGoods(Integer uid);


    /**-----分割线-------------*/


    /**
     * 通过ID查询单条数据
     *
     * @param myboxId 主键
     * @return 实例对象
     */
    Mybox queryById(Integer myboxId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Mybox> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param mybox 实例对象
     * @return 实例对象
     */
    Mybox insert(Mybox mybox);

    /**
     * 修改数据
     *
     * @param mybox 实例对象
     * @return 实例对象
     */
    Mybox update(Mybox mybox);

    /**
     * 通过主键删除数据
     *
     * @param myboxId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer myboxId);

}
