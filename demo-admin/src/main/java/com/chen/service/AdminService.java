package com.chen.service;

import bean.CommonResponse;
import bean.NewInfo;

public interface AdminService {

    CommonResponse<Integer> createNew(NewInfo newInfo);

    CommonResponse<Integer> updateNew(NewInfo newInfo);
}
