package com.back_blind_box_anytime.controller;

import com.back_blind_box_anytime.entity.Mybox;
import com.back_blind_box_anytime.my_interceptor.CurrentUser;
import com.back_blind_box_anytime.my_interceptor.CurrentUserInfo;
import com.back_blind_box_anytime.service.MyboxService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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

    /**
     * 查询最新的3条中奖数据
     *
     * @param user
     * @return
     */
    @GetMapping("/user/selectNew")
    public List<String> selectNew(@CurrentUser CurrentUserInfo user) {
        return this.myboxService.queryNewGoods(user.getUid());
    }

    /**
     * 查询用户中奖数据
     *
     * @param user
     * @return
     */
    @GetMapping("/user/selectAll")
    public List<Map<String, Object>> selectAll(@CurrentUser CurrentUserInfo user) {
        return this.myboxService.selectAll(user.getUid());
    }

    /**
     * 反盒
     *
     * @param myboxId
     * @return
     */
    @GetMapping("/user/backGoods")
    public Boolean backGoods(Integer myboxId, @CurrentUser CurrentUserInfo user) {
        return this.myboxService.backGoods(myboxId, user.getUid());
    }

    @GetMapping("/user/buy")
    public Boolean buy(Integer myboxId) {
        return this.myboxService.buy(myboxId);
    }

}
