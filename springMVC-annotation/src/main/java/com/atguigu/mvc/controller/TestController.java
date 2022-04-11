package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @projectName: SpringMVC
 * @package: com.atguigu.mvc.controller
 * @className: TestController
 * @author: jhb
 * @description: TODO
 * @date: 2022/2/25 23:02
 * @version: 1.0
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public String index(){

        return "index";
    }
}
