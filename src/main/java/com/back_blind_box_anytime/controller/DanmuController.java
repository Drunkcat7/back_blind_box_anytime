package com.back_blind_box_anytime.controller;

import com.back_blind_box_anytime.entity.Danmu;
import com.back_blind_box_anytime.entity.Goods;
import com.back_blind_box_anytime.service.DanmuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Danmu)表控制层
 *
 * @author makejava
 * @since 2023-04-23 15:46:20
 */
@RestController
@RequestMapping("danmu")
public class DanmuController {
    /**
     * 服务对象
     */
    @Resource
    private DanmuService danmuService;

    @GetMapping("/danmuData")
    public List<Danmu> allSeriesData(Integer seriesId) {
        System.out.println(seriesId);
        return this.danmuService.queryBySeriesId(seriesId);
    }
    /** -----------分界线-------- */


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Danmu selectOne(Integer id) {
        return this.danmuService.queryById(id);
    }

}
