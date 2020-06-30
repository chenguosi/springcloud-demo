package com.chen;

import bean.CommonResponse;
import bean.NewInfo;
import com.chen.service.AdminService;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoAdminApplicationTests {

    @Resource
    private AdminService adminService;
    
    @Test
    void createNew() {
        NewInfo test = new NewInfo(null,"test","123");
        NewInfo demo = new NewInfo(null,"demo","123");
        CommonResponse<Integer> response;
        response = adminService.createNew(test);
        assert response.getCode() == 0;

        try {
            adminService.createNew(demo);
        } catch (Exception e) {
            assert StringUtils.equals(e.getMessage(),"服务异常");
        }
    }

    @Test
    void updateNew() {
        NewInfo test = new NewInfo(null,"test","123");
        NewInfo demo = new NewInfo(null,"demo","123");
        CommonResponse<Integer> response;
        response = adminService.updateNew(test);
        assert response.getCode() == 0;

        try {
            adminService.updateNew(demo);
        } catch (Exception e) {
            assert StringUtils.equals(e.getMessage(),"服务异常");
        }
    }
    
}
