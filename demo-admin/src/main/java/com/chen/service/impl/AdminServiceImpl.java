package com.chen.service.impl;

import bean.CommonResponse;
import bean.NewInfo;
import com.chen.feignclient.ContentApi;
import com.chen.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private ContentApi contentApi;


    @Override
    public CommonResponse<Integer> createNew(NewInfo newInfo) {
        CommonResponse<Integer> response = contentApi.add(newInfo);
        return response;
    }

    @Override
    public CommonResponse<Integer> updateNew(NewInfo newInfo) {
        CommonResponse<Integer> response = contentApi.update(newInfo);
        return response;
    }
}
