package com.chen.feignclient;

import feigninterface.ContentInterface;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "demo-content",fallbackFactory = ContentFeignFactory.class)
public interface ContentApi extends ContentInterface {


}
