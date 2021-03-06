package com.chen.feignclient;

import feigninterface.ContentInterface;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(value = "demo-content",fallbackFactory = ContentFeignFactory.class)
public interface ContentApi extends ContentInterface {


}
