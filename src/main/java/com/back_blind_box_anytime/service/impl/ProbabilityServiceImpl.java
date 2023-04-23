package com.back_blind_box_anytime.service.impl;

import com.back_blind_box_anytime.entity.Probability;
import com.back_blind_box_anytime.dao.ProbabilityDao;
import com.back_blind_box_anytime.service.ProbabilityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Probability)表服务实现类
 *
 * @author makejava
 * @since 2023-04-23 22:07:03
 */
@Service("probabilityService")
public class ProbabilityServiceImpl implements ProbabilityService {
    @Resource
    private ProbabilityDao probabilityDao;
    /**
     * 通过seriesId查询单条数据
     *
     * @param seriesId 主键
     * @return 实例对象
     */
    @Override
    public Probability queryBySeriesId(Integer seriesId) {
        return this.probabilityDao.queryById(seriesId);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param probabilityId 主键
     * @return 实例对象
     */
    @Override
    public Probability queryById(Integer probabilityId) {
        return this.probabilityDao.queryById(probabilityId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Probability> queryAllByLimit(int offset, int limit) {
        return this.probabilityDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param probability 实例对象
     * @return 实例对象
     */
    @Override
    public Probability insert(Probability probability) {
        this.probabilityDao.insert(probability);
        return probability;
    }

    /**
     * 修改数据
     *
     * @param probability 实例对象
     * @return 实例对象
     */
    @Override
    public Probability update(Probability probability) {
        this.probabilityDao.update(probability);
        return this.queryById(probability.getProbabilityId());
    }

    /**
     * 通过主键删除数据
     *
     * @param probabilityId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer probabilityId) {
        return this.probabilityDao.deleteById(probabilityId) > 0;
    }
}
