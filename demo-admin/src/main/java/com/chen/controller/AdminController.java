package com.chen.controller;

import bean.CommonResponse;
import bean.NewInfo;
import com.chen.service.AdminService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private AdminService adminService;

    // 新增新闻
    @PostMapping("/createNew")
    public CommonResponse<Integer> createNew(@RequestBody NewInfo newInfo) {
        CommonResponse<Integer> response = adminService.createNew(newInfo);
        return response;
    }

    // 编辑新闻
    @PostMapping("/updateNew")
    public CommonResponse<Integer> updateNew(@RequestBody NewInfo newInfo) {
        CommonResponse<Integer> response = adminService.updateNew(newInfo);
        return response;
    }
}
