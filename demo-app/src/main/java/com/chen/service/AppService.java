package com.chen.service;

import bean.CommonResponse;
import bean.NewInfo;
import bean.UserInfo;
import cn.hutool.db.PageResult;

public interface AppService {

    CommonResponse<Integer> registry(UserInfo userInfo);

    CommonResponse<String> login(UserInfo userInfo);

    CommonResponse<PageResult<NewInfo>> getNewsList(String name, Integer pageNum, Integer pageSize);

    CommonResponse<NewInfo> getNewDetail(Long id);
}
