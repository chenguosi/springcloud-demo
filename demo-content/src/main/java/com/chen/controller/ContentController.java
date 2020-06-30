package com.chen.controller;

import bean.CommonResponse;
import bean.NewInfo;
import com.chen.service.ContentService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/content")
public class ContentController {

    @Resource
    private ContentService contentService;

    // 新增新闻
    @PostMapping("/add")
    public CommonResponse<Integer> add(@RequestBody NewInfo newInfo) {
        CommonResponse<Integer> response = contentService.insert(newInfo);
        return response;
    }

    // 删除新闻
    @PostMapping("/delete")
    public CommonResponse<Integer> delete(@RequestBody NewInfo newInfo) {
        CommonResponse<Integer> response = contentService.delete(newInfo);
        return response;
    }

    // 修改新闻
    @PostMapping("/update")
    public CommonResponse<Integer> update(@RequestBody NewInfo newInfo) {
        CommonResponse<Integer> response = contentService.update(newInfo);
        return response;
    }


    // 分页查询新闻
    @GetMapping("/query")
    public CommonResponse<PageInfo<NewInfo>> query(@RequestAttribute NewInfo newInfo) {
        CommonResponse<PageInfo<NewInfo>> response = contentService.query(newInfo);
        return response;
    }

    // 查询详细新闻
    @GetMapping("/queryDetail")
    public CommonResponse<NewInfo> queryDetail(@RequestParam Long id) {
        CommonResponse<NewInfo> response = contentService.queryDetail(id);
        return response;
    }

}
