package feigninterface;

import bean.CommonResponse;
import bean.NewInfo;
import cn.hutool.db.PageResult;
import org.springframework.web.bind.annotation.*;

/**
 * Content服务的对外Feign接口
 */
public interface ContentInterface {

    // 分页查询新闻
    @GetMapping("/content/query")
    CommonResponse<PageResult<NewInfo>> query(@RequestAttribute NewInfo newInfo);

    // 查询详细新闻
    @GetMapping("/content/queryDetail")
    CommonResponse<NewInfo> queryDetail(@RequestParam(value = "id") Long id);

    @PostMapping("/content/add")
    CommonResponse<Integer> add(@RequestBody NewInfo newInfo);

    // 修改新闻
    @PostMapping("/content/update")
    CommonResponse<Integer> update(@RequestBody NewInfo newInfo);
}
