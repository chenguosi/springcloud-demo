package com.chen.feignclient;

import bean.CommonResponse;
import bean.NewInfo;
import cn.hutool.db.PageResult;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ContentAdminFeignFactory implements FallbackFactory<ContentAdminApi> {
    @Override
    public ContentAdminApi create(Throwable throwable) {
        return new ContentAdminApi() {
            @Override
            public CommonResponse<PageResult<NewInfo>> query(NewInfo newInfo) {
                log.error("Content服务query接口异常");
                return new CommonResponse(501,"服务繁忙，稍后再试",null);
            }

            @Override
            public CommonResponse<NewInfo> queryDetail(Long id) {
                log.error("Content服务queryDetail接口异常");
                return new CommonResponse(501,"服务繁忙，稍后再试",null);
            }

            @Override
            public CommonResponse<Integer> add(NewInfo newInfo) {
                log.error("Content服务add接口异常");
                return new CommonResponse(501,"服务繁忙，稍后再试",null);
            }

            @Override
            public CommonResponse<Integer> update(NewInfo newInfo) {
                log.error("Content服务update接口异常");
                return new CommonResponse(501,"服务繁忙，稍后再试",null);
            }
        };
    }
}
