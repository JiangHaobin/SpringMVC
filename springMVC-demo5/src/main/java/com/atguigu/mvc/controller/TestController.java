package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @projectName: SpringMVC
 * @package: com.atguigu.mvc.controller
 * @className: TestController
 * @author: jhb
 * @description: TODO
 * @date: 2022/2/25 1:10
 * @version: 1.0
 */
@Controller
public class TestController {
    @RequestMapping("/testInterceptor")
    public String testInterceptor(){
        return "success";
    }
    @RequestMapping("/testExceptionHandle")
    public String testExceptionHandle(){
        int i=1/0;
        return "success";
    }
}
