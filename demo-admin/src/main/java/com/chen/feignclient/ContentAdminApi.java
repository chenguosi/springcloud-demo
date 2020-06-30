package com.chen.feignclient;

import feigninterface.ContentInterface;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(value = "demo-content",fallbackFactory = ContentAdminFeignFactory.class)
public interface ContentAdminApi extends ContentInterface {


}
