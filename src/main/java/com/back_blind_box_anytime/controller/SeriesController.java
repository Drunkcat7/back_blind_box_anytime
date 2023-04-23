package com.back_blind_box_anytime.controller;

import com.back_blind_box_anytime.entity.Series;
import com.back_blind_box_anytime.service.SeriesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Series)表控制层
 *
 * @author makejava
 * @since 2023-04-23 14:09:05
 */
@RestController
@RequestMapping("series")
public class SeriesController {
    /**
     * 服务对象
     */
    @Resource
    private SeriesService seriesService;


    /**
     * 查询所有数据
     * @return 数据列表
     */
    @GetMapping("/allSeriesData")
    public List<Series> allSeriesData() {
        return this.seriesService.queryAll(null);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param seriesId 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public Series selectOne(Integer seriesId) {
        return this.seriesService.queryById(seriesId);
    }



}
