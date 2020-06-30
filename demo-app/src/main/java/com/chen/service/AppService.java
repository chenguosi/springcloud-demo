package com.chen.service;

import bean.CommonResponse;
import bean.NewInfo;
import bean.UserInfo;
import com.github.pagehelper.PageInfo;

public interface AppService {

    CommonResponse<Integer> registry(UserInfo userInfo);

    CommonResponse<String> login(UserInfo userInfo);

    CommonResponse<PageInfo<NewInfo>> getNewsList(String name, Integer pageNum, Integer pageSize);

    CommonResponse<NewInfo> getNewDetail(Long id);
}
