package com.chen;

import bean.CommonResponse;
import bean.UserInfo;
import com.chen.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoSupportApplicationTests {

    @Resource
    private UserService userService;

    // 测试注册
    @Test
    public void registry(){
        UserInfo admin = new UserInfo("admin","123");
        UserInfo test = new UserInfo("test","4546");
        UserInfo other = new UserInfo("lisi","fds");

        CommonResponse adminRes = userService.registry(admin);
        assert adminRes.getCode() == 0;

        CommonResponse testRes = userService.registry(test);
        assert testRes.getCode() != 0;

        try {
            userService.registry(other);
        } catch (Exception e) {
            assert StringUtils.equals(e.getMessage(),"服务异常");
        }
    }

    // 测试登录
    @Test
    public void login(){
        UserInfo admin = new UserInfo("admin","123");
        UserInfo test = new UserInfo("test","4546");
        UserInfo other = new UserInfo("lisi","fds");

        CommonResponse adminRes = userService.registry(admin);
        assert adminRes.getCode() == 0;

        CommonResponse testRes = userService.registry(test);
        assert testRes.getCode() != 0;

        try {
            userService.registry(other);
        } catch (Exception e) {
            assert StringUtils.equals(e.getMessage(),"服务异常");
        }
    }
}
