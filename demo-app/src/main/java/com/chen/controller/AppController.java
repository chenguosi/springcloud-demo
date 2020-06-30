package com.chen.controller;

import bean.CommonResponse;
import bean.NewInfo;
import bean.UserInfo;
import cn.hutool.db.PageResult;
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
    public CommonResponse<Integer> registry(@RequestBody UserInfo userInfo) {
        CommonResponse<Integer> commonResponse = appService.registry(userInfo);
        return commonResponse;
    }

    // 用户登录
    @GetMapping("/login")
    public CommonResponse<String> login(@RequestAttribute UserInfo userInfo) {
        CommonResponse<String> commonResponse = appService.login(userInfo);
        return commonResponse;
    }

    // 获取新闻列表
    @GetMapping("getNewsList")
    public CommonResponse<PageResult<NewInfo>> getNewsList(@RequestParam String name,
                                                           @RequestParam(defaultValue = "1") Integer pageNum,
                                                           @RequestParam(defaultValue = "10") Integer pageSize)
    {
        CommonResponse<PageResult<NewInfo>> commonResponse = appService.getNewsList(name,pageNum,pageSize);
        return commonResponse;
    }

    // 查看新闻详情
    @GetMapping("/getNewDetail")
    public CommonResponse<NewInfo> getNewDetail(@RequestParam Long id) {
        CommonResponse<NewInfo> commonResponse = appService.getNewDetail(id);
        return commonResponse;
    }
}
