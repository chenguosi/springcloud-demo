package com.chen.service;


import bean.CommonResponse;
import bean.NewInfo;
import com.github.pagehelper.PageInfo;

public interface ContentService {


    CommonResponse<Integer> insert(NewInfo newInfo);

    CommonResponse<Integer> delete(NewInfo newInfo);

    CommonResponse<Integer> update(NewInfo newInfo);

    CommonResponse<PageInfo<NewInfo>> query(NewInfo newInfo);

    CommonResponse<NewInfo> queryDetail(Long id);
}
