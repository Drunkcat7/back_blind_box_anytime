package com.back_blind_box_anytime.controller;

import com.back_blind_box_anytime.entity.Account;
import com.back_blind_box_anytime.my_interceptor.CurrentUser;
import com.back_blind_box_anytime.my_interceptor.CurrentUserInfo;
import com.back_blind_box_anytime.service.AccountService;
import com.back_blind_box_anytime.tools.GetStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
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


    @PostMapping("/user/luckyDraw")
    public boolean luckyDraw(Integer seriesId,@CurrentUser CurrentUserInfo user){
        return this.accountService.luckyDraw(seriesId,user.getUid());
    }




    @GetMapping("/user/test")
    public Map<String, Object> UseTest(@CurrentUser CurrentUserInfo currentUserInfo) {
        Map<String, Object> map = new HashMap<>();
        map.put("data", currentUserInfo);
        return map;
    }

}

