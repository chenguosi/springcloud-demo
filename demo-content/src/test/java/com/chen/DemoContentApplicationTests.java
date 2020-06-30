package com.chen;

import bean.CommonResponse;
import bean.NewInfo;
import com.chen.service.ContentService;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoContentApplicationTests {

    @Resource
    private ContentService contentService;
    
    @Test
    void insert() {
        NewInfo test = new NewInfo(null,"test","123");
        NewInfo demo = new NewInfo(null,"demo","123");
        CommonResponse<Integer> response;
        response = contentService.insert(test);
        assert response.getCode() == 0;

        try {
            contentService.insert(demo);
        } catch (Exception e) {
            assert StringUtils.equals(e.getMessage(),"服务异常");
        }
    }

    @Test
    void delete(){
        NewInfo test = new NewInfo(null,"test","123");
        NewInfo demo = new NewInfo(null,"demo","123");
        CommonResponse<Integer> response;
        response = contentService.delete(test);
        assert response.getCode() == 0;

        try {
            contentService.delete(demo);
        } catch (Exception e) {
            assert StringUtils.equals(e.getMessage(),"服务异常");
        }
    }

    @Test
    void update(){
        NewInfo test = new NewInfo(null,"test","123");
        NewInfo demo = new NewInfo(null,"demo","123");
        CommonResponse<Integer> response;
        response = contentService.update(test);
        assert response.getCode() == 0;

        try {
            contentService.update(demo);
        } catch (Exception e) {
            assert StringUtils.equals(e.getMessage(),"服务异常");
        }
    }

    @Test
    void query(){
        NewInfo test = new NewInfo(null,"test","123");
        NewInfo demo = new NewInfo(null,"demo","123");
        CommonResponse<PageInfo<NewInfo>> response;
        response = contentService.query(test);
        assert response.getCode() == 0;

        try {
            contentService.query(demo);
        } catch (Exception e) {
            assert StringUtils.equals(e.getMessage(),"服务异常");
        }
    }

    @Test
    void queryDetail(){
        Long test = 1L;
        Long demo = 2L;
        CommonResponse<NewInfo> response;
        response = contentService.queryDetail(test);
        assert response.getCode() == 0;

        try {
            contentService.queryDetail(demo);
        } catch (Exception e) {
            assert StringUtils.equals(e.getMessage(),"服务异常");
        }
    }
    
}
