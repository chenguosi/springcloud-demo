package com.chen.service.impl;

import bean.CommonResponse;
import bean.NewInfo;
import com.chen.feignclient.ContentAdminApi;
import com.chen.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private ContentAdminApi contentAdminApi;


    @Override
    public CommonResponse<Integer> createNew(NewInfo newInfo) {
        CommonResponse<Integer> response = contentAdminApi.add(newInfo);
        return response;
    }

    @Override
    public CommonResponse<Integer> updateNew(NewInfo newInfo) {
        CommonResponse<Integer> response = contentAdminApi.update(newInfo);
        return response;
    }
}
