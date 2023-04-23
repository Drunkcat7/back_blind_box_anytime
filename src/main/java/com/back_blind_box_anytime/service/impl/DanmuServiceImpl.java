package com.back_blind_box_anytime.service.impl;

import com.back_blind_box_anytime.entity.Danmu;
import com.back_blind_box_anytime.dao.DanmuDao;
import com.back_blind_box_anytime.service.DanmuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Danmu)表服务实现类
 *
 * @author makejava
 * @since 2023-04-23 15:46:20
 */
@Service("danmuService")
public class DanmuServiceImpl implements DanmuService {
    @Resource
    private DanmuDao danmuDao;

    /**
     * 通过seriesId查询多条数据
     * @param seriesId 外键
     * @return
     */
    @Override
    public List<Danmu> queryBySeriesId(Integer seriesId) {
        return this.danmuDao.queryBySeriesId(seriesId);
    }
    /** --------- 分界线 */

    /**
     * 通过ID查询单条数据
     *
     * @param danmuId 主键
     * @return 实例对象
     */
    @Override
    public Danmu queryById(Integer danmuId) {
        return this.danmuDao.queryById(danmuId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Danmu> queryAllByLimit(int offset, int limit) {
        return this.danmuDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param danmu 实例对象
     * @return 实例对象
     */
    @Override
    public Danmu insert(Danmu danmu) {
        this.danmuDao.insert(danmu);
        return danmu;
    }

    /**
     * 修改数据
     *
     * @param danmu 实例对象
     * @return 实例对象
     */
    @Override
    public Danmu update(Danmu danmu) {
        this.danmuDao.update(danmu);
        return this.queryById(danmu.getDanmuId());
    }

    /**
     * 通过主键删除数据
     *
     * @param danmuId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer danmuId) {
        return this.danmuDao.deleteById(danmuId) > 0;
    }
}
