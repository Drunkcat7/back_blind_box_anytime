package com.back_blind_box_anytime.service.impl;

import com.back_blind_box_anytime.entity.Goods;
import com.back_blind_box_anytime.dao.GoodsDao;
import com.back_blind_box_anytime.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Goods)表服务实现类
 *
 * @author makejava
 * @since 2023-04-23 15:42:30
 */
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsDao goodsDao;

    /**
     * 通过seriesId查询多条数据
     * @param seriesId 外键
     * @return
     */
    @Override
    public List<Goods> queryBySeriesId(Integer seriesId) {
        return this.goodsDao.queryBySeriesId(seriesId);
    }

    /** --------- 分界线 */

    /**
     * 通过ID查询单条数据
     *
     * @param goodsId 主键
     * @return 实例对象
     */
    @Override
    public Goods queryById(Integer goodsId) {
        return this.goodsDao.queryById(goodsId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Goods> queryAllByLimit(int offset, int limit) {
        return this.goodsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param goods 实例对象
     * @return 实例对象
     */
    @Override
    public Goods insert(Goods goods) {
        this.goodsDao.insert(goods);
        return goods;
    }

    /**
     * 修改数据
     *
     * @param goods 实例对象
     * @return 实例对象
     */
    @Override
    public Goods update(Goods goods) {
        this.goodsDao.update(goods);
        return this.queryById(goods.getGoodsId());
    }

    /**
     * 通过主键删除数据
     *
     * @param goodsId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer goodsId) {
        return this.goodsDao.deleteById(goodsId) > 0;
    }
}
