package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.SecureRandom;

/**
 * @projectName: SpringMVC
 * @package: com.atguigu.mvc.controller
 * @className: HelloController
 * @author: jhb
 * @description: TODO
 * @date: 2022/2/16 2:59
 * @version: 1.0
 */
@Controller
public class HelloController {
    @RequestMapping(value = "/")//请求映射
    public String index(){
        //返回试图名称
        return "index";
    }
    @RequestMapping(value = "/target")
    public String toTarget(){
        return "target";
    }
}
