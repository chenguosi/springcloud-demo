package com.chen.service;

import bean.CommonResponse;
import bean.UserInfo;

public interface AppService {

    CommonResponse registry(UserInfo userInfo);

    CommonResponse login(UserInfo userInfo);

    CommonResponse getNewsList(String name);

    CommonResponse getNewDetail(Long id);
}
