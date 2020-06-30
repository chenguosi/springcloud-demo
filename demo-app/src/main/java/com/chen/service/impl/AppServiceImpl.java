package com.chen.service.impl;

import org.springframework.stereotype.Service;

import com.chen.feignclient.SupportApi;
import com.chen.service.AppService;

import bean.CommonResponse;
import bean.UserInfo;

import javax.annotation.Resource;

@Service
public class AppServiceImpl implements AppService {

    @Resource
    private SupportApi supportApi;

    @Override
    public CommonResponse registry(UserInfo userInfo) {
        return null;
    }

    @Override
    public CommonResponse login(UserInfo userInfo) {
        // 用户密码校验
        // 成功后返回JWT并将JWT写入缓存设置超时时间
        return null;
    }

    @Override
    public CommonResponse getNewsList(String name) {
        return null;
    }

    @Override
    public CommonResponse getNewDetail(Long id) {
        return null;
    }
}
