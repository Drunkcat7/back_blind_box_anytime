package com.back_blind_box_anytime.controller;

import com.back_blind_box_anytime.entity.Goods;
import com.back_blind_box_anytime.entity.Series;
import com.back_blind_box_anytime.service.GoodsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Goods)表控制层
 *
 * @author makejava
 * @since 2023-04-23 15:42:30
 */
@RestController
@RequestMapping("goods")
public class GoodsController {
    /**
     * 服务对象
     */
    @Resource
    private GoodsService goodsService;



    @GetMapping("/goodsData")
    public List<Goods> allSeriesData(Integer seriesId) {
        return this.goodsService.queryBySeriesId(seriesId);
    }

    /** -----------分界线-------- */

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Goods selectOne(Integer id) {
        return this.goodsService.queryById(id);
    }

}
