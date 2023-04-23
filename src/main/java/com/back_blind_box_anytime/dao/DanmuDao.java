package com.back_blind_box_anytime.dao;

import com.back_blind_box_anytime.entity.Danmu;
import com.back_blind_box_anytime.entity.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Danmu)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-23 15:46:20
 */
public interface DanmuDao {


    /**
     * 通过seriesId查询多条数据
     *
     * @param seriesId 外键
     * @return 对象列表
     */
    List<Danmu> queryBySeriesId(Integer seriesId);

    /** -------------分界线----------*/

    /**
     * 通过ID查询单条数据
     *
     * @param danmuId 主键
     * @return 实例对象
     */
    Danmu queryById(Integer danmuId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Danmu> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param danmu 实例对象
     * @return 对象列表
     */
    List<Danmu> queryAll(Danmu danmu);

    /**
     * 新增数据
     *
     * @param danmu 实例对象
     * @return 影响行数
     */
    int insert(Danmu danmu);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Danmu> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Danmu> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Danmu> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Danmu> entities);

    /**
     * 修改数据
     *
     * @param danmu 实例对象
     * @return 影响行数
     */
    int update(Danmu danmu);

    /**
     * 通过主键删除数据
     *
     * @param danmuId 主键
     * @return 影响行数
     */
    int deleteById(Integer danmuId);

}

