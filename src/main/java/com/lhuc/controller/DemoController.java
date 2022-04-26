package com.lhuc.controller;

import com.github.pagehelper.PageInfo;
import com.lhuc.pojo.Emp;
import com.lhuc.pojo.JsonResult;
import com.lhuc.pojo.User;
import com.lhuc.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author lhucstart
 * @create 2021-05-11 11:28
 */
@Slf4j
@RestController
@RequestMapping(value = "/demo")
public class DemoController {


    private static final int PAGE_SIZE = 10;

    @Resource
    private UserService userService;

    /**
     * 分页查询员工
     */
    @GetMapping("/list/{currPage}")
    public JsonResult pageUser(@PathVariable("currPage") Integer currPage,
                               Map<String, Object> map) {
        System.err.println("当前页  ： " + currPage);
        PageInfo<User> pagUser = userService.getUserPage(currPage, PAGE_SIZE);
        //员工列表的数据
        map.put("users", pagUser.getList());
        //当前页
        map.put("currPage", currPage);
        //总页数
        map.put("totalPage", pagUser.getPages());
        return JsonResult.getJsonResult(200, "成功返回结果集", map);
    }


    @GetMapping("/emp/{currPage}")
    public JsonResult pageEmp(@PathVariable("currPage") Integer currPage,
                               Map<String, Object> map) {
        log.info("当前页  ： {}" , currPage);
        PageInfo<Emp> pagEmp = userService.getEmpPage(currPage, PAGE_SIZE);
        //员工列表的数据
        map.put("users", pagEmp.getList());
        //当前页
        map.put("currPage", currPage);
        //总页数
        map.put("totalPage", pagEmp.getPages());
        return JsonResult.getJsonResult(200, "成功返回结果集", map);
    }



}
