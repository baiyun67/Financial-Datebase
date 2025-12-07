package com.cun.controller;

import com.cun.pojo.Financial;
import com.cun.pojo.Result;
import com.cun.service.Change;
import com.cun.service.Delete;
import com.cun.service.Insert;
import com.cun.service.Search;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/host")
@RestController
public class hostController {
    @Autowired
    private Search search;
    @GetMapping
    public Result getAllFinancialList() {
        log.warn("search-controller-begin");
        return Result.success(search.getAllFinancialList());
    }

    @PostMapping("/search")
    public Result getFinancialList(@RequestBody Financial financial) {
        log.warn("search-param-controller-begin");
        return Result.success(search.getFinancialList(financial));
    }

    @Autowired
    private Insert insert;
    @PostMapping("/insert")
    public Result insertFinancial(@RequestBody Financial financial) {
        log.warn("insert-controller-begin");
        return Result.success(insert.insert(financial));
    }

    @Autowired
    private Change change;
    @PostMapping("/change")//前端传入的参数应该是id和修改的内容
    public Result changeFinancial(@RequestBody Financial financial) {
        log.warn("change-controller-begin");
        return Result.success(change.change(financial));
    }
    @Autowired
    private Delete delete;
    @DeleteMapping("/delete")
    public Result deleteFinancial(@Param("id")Integer id) {
        log.warn("delete-controller-begin");
        return Result.success(delete.delete(id));
    }

}
