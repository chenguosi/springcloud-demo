package com.chen.service.impl;

import bean.CommonResponse;
import bean.NewInfo;
import bean.UserInfo;
import cn.hutool.db.PageResult;
import com.chen.feignclient.ContentApi;
import com.chen.feignclient.SupportApi;
import com.chen.service.AppService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AppServiceImpl implements AppService {

    @Resource
    private SupportApi supportApi;

    @Resource
    private ContentApi contentApi;

    @Override
    public CommonResponse<Integer> registry(UserInfo userInfo) {
        // 参数合法性校验
        CommonResponse response;
        if (StringUtils.equals("demo",userInfo.getName())) {
            response =  new CommonResponse(501,"fail",null);
        } else {
            response = supportApi.registry(userInfo);
        }
        return response;
    }

    @Override
    public CommonResponse<String> login(UserInfo userInfo) {
        // 用户密码校验
        CommonResponse loginResponse = supportApi.login(userInfo);
         if (loginResponse.getCode() == 0) {
             // 成功后返回JWT并将JWT写入缓存设置超时时间
             // 使用JWT工具类生成token，放入缓存
             String token="token123";
             loginResponse.setData(token);
         }
         return loginResponse;
    }

    @Override
    public CommonResponse<PageResult<NewInfo>> getNewsList(String name, Integer pageNum, Integer pageSize) {
        CommonResponse<PageResult<NewInfo>> response;
        if (StringUtils.isNotBlank(name)) {
            NewInfo newInfo = new NewInfo();
            newInfo.setTitle(name).setPageNum(pageNum).setPageSize(pageSize);
            response = contentApi.query(newInfo);
        } else {
            response = new CommonResponse<PageResult<NewInfo>>(501,"fail",null);
        }
        return response;
    }

    @Override
    public CommonResponse<NewInfo> getNewDetail(Long id) {
        CommonResponse<NewInfo> response = contentApi.queryDetail(id);
        return response;
    }
}
