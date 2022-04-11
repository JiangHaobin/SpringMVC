package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @projectName: SpringMVC
 * @package: com.atguigu.mvc.controller
 * @className: JspController
 * @author: jhb
 * @description: TODO
 * @date: 2022/2/21 11:17
 * @version: 1.0
 */
@Controller
public class JspController {
    @RequestMapping("/success")
    public String success(){
        return "success";
    }
}
