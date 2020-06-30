package com.chen;

import bean.CommonResponse;
import bean.NewInfo;
import bean.UserInfo;
import cn.hutool.db.PageResult;
import com.chen.service.AppService;
import org.apache.commons.lang.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoAppApplicationTests {

    @Resource
    private AppService appService;

    @Test
    void registry(){
        UserInfo admin = new UserInfo("admin","123");
        UserInfo test = new UserInfo("test","4546");
        UserInfo other = new UserInfo("lisi","fds");
        UserInfo demo = new UserInfo("demo","asd");

        CommonResponse<Integer> response;
        response = appService.registry(demo);
        assert response.getCode() == 501;

        response = appService.registry(admin);
        assert response.getCode() == 0;

        response = appService.registry(test);
        assert response.getCode() != 0;

        try {
            appService.registry(other);
        } catch (Exception e) {
            assert StringUtils.equals(e.getMessage(),"服务异常");
        }
    }

    @Test
    void login(){
        UserInfo admin = new UserInfo("admin","123");
        UserInfo test = new UserInfo("test","4546");
        UserInfo other = new UserInfo("lisi","fds");
        CommonResponse adminRes = appService.registry(admin);
        assert adminRes.getCode() == 0;

        CommonResponse testRes = appService.registry(test);
        assert testRes.getCode() != 0;

        try {
            appService.registry(other);
        } catch (Exception e) {
            assert StringUtils.equals(e.getMessage(),"服务异常");
        }
    }

    @Test
    void getNewsList(){
        CommonResponse<PageResult<NewInfo>> response;
        response = appService.getNewsList("test",1,10);
        assert response.getCode() == 0;

        try {
            appService.getNewsList("",1,10);
        } catch (Exception e) {
            assert org.apache.commons.lang3.StringUtils.equals(e.getMessage(),"服务异常");
        }

        try {
            appService.getNewsList("demo",1,10);
        } catch (Exception e) {
            assert org.apache.commons.lang3.StringUtils.equals(e.getMessage(),"服务异常");
        }
    }

    @Test
    void getNewDetail(){

        Long test = 1L;
        Long demo = 2L;
        CommonResponse<NewInfo> response;
        response = appService.getNewDetail(test);
        assert response.getCode() == 0;

        try {
            appService.getNewDetail(demo);
        } catch (Exception e) {
            assert org.apache.commons.lang3.StringUtils.equals(e.getMessage(),"服务异常");
        }

    }
}
