package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;

/**
 * @projectName: SpringMVC
 * @package: com.atguigu.mvc.controller
 * @className: TestController
 * @author: jhb
 * @description: TODO
 * @date: 2022/2/19 19:35
 * @version: 1.0
 */
@Controller
public class TestController  {
    @RequestMapping("/test_view")
    public String testView(){
        return "test_view";
    }
//    @RequestMapping("/")
//    public String index(){
//        return "index";
//    }
}
