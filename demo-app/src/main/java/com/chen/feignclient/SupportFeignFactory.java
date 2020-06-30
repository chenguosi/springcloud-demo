package com.chen.feignclient;

import bean.CommonResponse;
import bean.UserInfo;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SupportFeignFactory implements FallbackFactory<SupportApi> {
    @Override
    public SupportApi create(Throwable throwable) {
        return new SupportApi() {
            @Override
            public CommonResponse registry(UserInfo userInfo) {
                log.error("Support服务registry接口异常");
                return new CommonResponse(501,"服务繁忙，稍后再试",null);
            }

            @Override
            public CommonResponse login(UserInfo userInfo) {
                log.error("Support服务login接口异常");
                return new CommonResponse(501,"服务繁忙，稍后再试",null);
            }
        };
    }
}
