package com.chen.service;

import bean.CommonResponse;
import bean.UserInfo;

public interface UserService {


    CommonResponse registry(UserInfo userInfo);

    CommonResponse login(UserInfo userInfo);
}
