package com.back_blind_box_anytime.controller;

import com.back_blind_box_anytime.entity.Account;
import com.back_blind_box_anytime.entity.Goods;
import com.back_blind_box_anytime.my_interceptor.CurrentUser;
import com.back_blind_box_anytime.my_interceptor.CurrentUserInfo;
import com.back_blind_box_anytime.service.AccountService;
import com.back_blind_box_anytime.tools.GetStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * (Account)表控制层
 *
 * @author makejava
 * @since 2023-04-10 17:21:43
 */
@RestController
@RequestMapping("account")
public class AccountController {
    /**
     * 服务对象
     */
    @Resource
    private AccountService accountService;

    /**
     * 用户注册
     *
     * @param account 实体
     * @return 新增结果
     */
    @PostMapping("/reg")
    public ResponseEntity<Account> registeredAdd(Account account) {
        System.out.println(account.getUser() + account.getPassword());

        return ResponseEntity.ok(this.accountService.insert(account));
    }

    /**
     * 用户登录
     *
     * @param user
     * @param password
     * @return 用户信息与token
     */
    @PostMapping("/login")
    public ResponseEntity<Map<String, Object>> login(String user, String password) {
        System.out.println(user + password);
        return ResponseEntity.ok(GetStatus.get(this.accountService.login(user, password)));
    }

    /**
     * 抽奖接口
     * @param seriesId
     * @param user
     * @return 中奖商品
     */
    @PostMapping("/user/luckyDraw")
    public Goods luckyDraw(Integer seriesId, @CurrentUser CurrentUserInfo user){
        return this.accountService.luckyDraw(seriesId,user.getUid());
    }

    /**
     * 获取用户信息
     * @param currentUserInfo
     * @return 用户名 钻石
     */
    @GetMapping("/user/queryUserInfo")
    public Map<String, Object> queryUserInfo(@CurrentUser CurrentUserInfo currentUserInfo) {
        return this.accountService.queryUserInfo(currentUserInfo.getUid());
    }

    /**
     * 充值
     * @param diamond
     * @param currentUserInfo
     * @return
     */
    @PutMapping("/user/topUp")
    public Boolean topUp(Double diamond,@CurrentUser CurrentUserInfo currentUserInfo) {
        return this.accountService.topUp(diamond,currentUserInfo.getUid());
    }
}

