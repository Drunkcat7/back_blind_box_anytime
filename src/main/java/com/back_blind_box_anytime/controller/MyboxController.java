package com.back_blind_box_anytime.controller;

import com.back_blind_box_anytime.entity.Mybox;
import com.back_blind_box_anytime.service.MyboxService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Mybox)表控制层
 *
 * @author makejava
 * @since 2023-04-23 22:58:34
 */
@RestController
@RequestMapping("mybox")
public class MyboxController {
    /**
     * 服务对象
     */
    @Resource
    private MyboxService myboxService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Mybox selectOne(Integer id) {
        return this.myboxService.queryById(id);
    }

}
