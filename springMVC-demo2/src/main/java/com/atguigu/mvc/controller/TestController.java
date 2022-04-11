package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @projectName: SpringMVC
 * @package: com.atguigu.mvc.controller
 * @className: TestController
 * @author: jhb
 * @description: TODO
 * @date: 2022/2/17 12:09
 * @version: 1.0
 */
@Controller
public class TestController {
    @RequestMapping(value ="/")
    public String index(){
        return "index";
    }
    @RequestMapping(value = "/param")
    public String param(){
        return "test_param";
    }
}
