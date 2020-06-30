package com.chen.controller;

import bean.CommonResponse;
import bean.UserInfo;
import com.chen.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    // 用户注册
    @PostMapping("/registry")
    public CommonResponse registry(@RequestBody UserInfo userInfo) {
        CommonResponse commonResponse = userService.registry(userInfo);
        return commonResponse;
    }

    // 用户登录
    @GetMapping("/login")
    public CommonResponse login(@RequestAttribute UserInfo userInfo) {
        CommonResponse commonResponse = userService.login(userInfo);
        return commonResponse;
    }
}
