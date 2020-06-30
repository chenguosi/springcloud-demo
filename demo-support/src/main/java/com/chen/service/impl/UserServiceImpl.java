package com.chen.service.impl;

import bean.CommonResponse;
import bean.UserInfo;
import com.chen.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public CommonResponse registry(UserInfo userInfo) {
        // 简单模拟 账号为admin能注册成功,test注册失败，其余的抛异常
        if (StringUtils.equals("admin",userInfo.getName())) {
            // 存数据库
            return new CommonResponse(0,"success",null);
        } else if (StringUtils.equals("test",userInfo.getName())){
            return new CommonResponse(501,"fail",null);
        } else {
            throw new RuntimeException("服务异常");
        }
    }

    @Override
    public CommonResponse login(UserInfo userInfo) {
        // 账号为admin可以登录成功，test登录失败,其余的抛异常
        if (StringUtils.equals("admin",userInfo.getName())) {
            return new CommonResponse(0,"success",null);
        } else if (StringUtils.equals("test",userInfo.getName())){
            return new CommonResponse(501,"fail",null);
        } else {
            throw new RuntimeException("服务异常");
        }
    }
}
