package com.back_blind_box_anytime.controller;

import com.back_blind_box_anytime.entity.Probability;
import com.back_blind_box_anytime.service.ProbabilityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Probability)表控制层
 *
 * @author makejava
 * @since 2023-04-23 22:07:03
 */
@RestController
@RequestMapping("probability")
public class ProbabilityController {
    /**
     * 服务对象
     */
    @Resource
    private ProbabilityService probabilityService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Probability selectOne(Integer id) {
        return this.probabilityService.queryById(id);
    }

}
