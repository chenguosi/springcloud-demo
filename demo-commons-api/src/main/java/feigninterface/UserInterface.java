package feigninterface;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;

import bean.CommonResponse;
import bean.UserInfo;

/**
 * support服务的对外Feign接口
 */
public interface UserInterface {

    // 用户注册
    @PostMapping("/user/registry")
    CommonResponse registry(@RequestBody UserInfo userInfo);

    // 用户登录
    @GetMapping("/user/login")
    CommonResponse login(@RequestAttribute UserInfo userInfo);
}
