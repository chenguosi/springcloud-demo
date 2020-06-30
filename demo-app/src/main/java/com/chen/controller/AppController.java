package com.chen.controller;

import bean.CommonResponse;
import bean.UserInfo;
import com.chen.service.AppService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/app")
public class AppController {

    @Resource
    private AppService appService;

    // 用户注册
    @PostMapping("/registry")
    public CommonResponse registry(@RequestBody UserInfo userInfo) {
        CommonResponse commonResponse = appService.registry(userInfo);
        return commonResponse;
    }

    // 用户登录
    @GetMapping("/login")
    public CommonResponse login(@RequestAttribute UserInfo userInfo) {
        CommonResponse commonResponse = appService.login(userInfo);
        return commonResponse;
    }

    // 获取新闻列表
    @GetMapping("getNewsList")
    public CommonResponse getNewsList(@RequestParam String name) {
        CommonResponse commonResponse = appService.getNewsList(name);
        return commonResponse;
    }

    // 查看新闻详情
    @GetMapping("/getNewDetail")
    public CommonResponse getNewDetail(@RequestParam Long id) {
        CommonResponse commonResponse = appService.getNewDetail(id);
        return commonResponse;
    }
}
