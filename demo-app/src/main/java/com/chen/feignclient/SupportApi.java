package com.chen.feignclient;

import feigninterface.UserInterface;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(value = "demo-support",fallbackFactory = SupportFeignFactory.class)
public interface SupportApi extends UserInterface {
}
