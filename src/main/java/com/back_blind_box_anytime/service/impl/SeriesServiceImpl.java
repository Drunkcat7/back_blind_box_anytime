package com.back_blind_box_anytime.service.impl;

import com.back_blind_box_anytime.entity.Series;
import com.back_blind_box_anytime.dao.SeriesDao;
import com.back_blind_box_anytime.service.SeriesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Series)表服务实现类
 *
 * @author makejava
 * @since 2023-04-23 14:09:05
 */
@Service("seriesService")
public class SeriesServiceImpl implements SeriesService {
    @Resource
    private SeriesDao seriesDao;

    @Override
    public List<Series> queryAll(Series series) {
        return this.seriesDao.queryAll(series);
    }

    /** ----------分界线------------- */

    /**
     * 通过ID查询单条数据
     *
     * @param seriesId 主键
     * @return 实例对象
     */
    @Override
    public Series queryById(Integer seriesId) {
        return this.seriesDao.queryById(seriesId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Series> queryAllByLimit(int offset, int limit) {
        return this.seriesDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param series 实例对象
     * @return 实例对象
     */
    @Override
    public Series insert(Series series) {
        this.seriesDao.insert(series);
        return series;
    }

    /**
     * 修改数据
     *
     * @param series 实例对象
     * @return 实例对象
     */
    @Override
    public Series update(Series series) {
        this.seriesDao.update(series);
        return this.queryById(series.getSeriesId());
    }

    /**
     * 通过主键删除数据
     *
     * @param seriesId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer seriesId) {
        return this.seriesDao.deleteById(seriesId) > 0;
    }
}
