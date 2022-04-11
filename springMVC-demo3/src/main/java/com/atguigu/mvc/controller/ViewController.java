package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @projectName: SpringMVC
 * @package: com.atguigu.mvc.controller
 * @className: ViewController
 * @author: jhb
 * @description: TODO
 * @date: 2022/2/20 20:54
 * @version: 1.0
 */
@Controller
public class ViewController {
    @RequestMapping("/testThymeleafView")
    public String testThymeleafView(){
        return "success";
    }
    @RequestMapping("/testForward")
    public String testForward(){
        return "forward:/testThymeleafView";
    }
    @RequestMapping("testRedirect")
    public String testRedirect(){
        return "redirect:/testThymeleafView";
    }
}
