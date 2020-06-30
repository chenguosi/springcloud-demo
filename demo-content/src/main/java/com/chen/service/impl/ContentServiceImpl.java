package com.chen.service.impl;

import bean.CommonResponse;
import bean.NewInfo;
import cn.hutool.db.PageResult;
import com.chen.service.ContentService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContentServiceImpl implements ContentService {

    @Override
    public CommonResponse<Integer> insert(NewInfo newInfo) {
        // 参数校验成功后存入数据库
        if (StringUtils.equals("test",newInfo.getTitle())) {
            return new CommonResponse<Integer>(0,"success",1);
        } else {
            throw new RuntimeException("服务异常");
        }
    }

    @Override
    public CommonResponse<Integer> delete(NewInfo newInfo) {
        if (StringUtils.equals("test",newInfo.getTitle())) {
            return new CommonResponse<Integer>(0,"success",1);
        } else {
            throw new RuntimeException("服务异常");
        }
    }

    @Override
    public CommonResponse<Integer> update(NewInfo newInfo) {
        if (StringUtils.equals("test",newInfo.getTitle())) {
            return new CommonResponse<Integer>(0,"success", 1);
        } else {
            throw new RuntimeException("服务异常");
        }
    }

    @Override
    public CommonResponse<PageResult<NewInfo>> query(NewInfo newInfo) {
        if (StringUtils.equals("test",newInfo.getTitle())) {
            List<NewInfo> list = new ArrayList<>();
            PageResult<NewInfo> pageInfo = new PageResult<>();
            pageInfo.addAll(list);
            return new CommonResponse<PageResult<NewInfo>>(0,"success", pageInfo);
        } else {
            throw new RuntimeException("服务异常");
        }
    }

    @Override
    public CommonResponse<NewInfo> queryDetail(Long id) {
        if (id.equals(1L)) {
            return new CommonResponse<NewInfo>(0,"success", null);
        } else {
            throw new RuntimeException("服务异常");
        }
    }

}
