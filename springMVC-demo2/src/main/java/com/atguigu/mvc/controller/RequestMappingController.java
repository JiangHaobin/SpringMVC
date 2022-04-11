package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @projectName: SpringMVC
 * @package: com.atguigu.mvc.controller
 * @className: RequestMappingController
 * @author: jhb
 * @description: TODO
 * @date: 2022/2/17 12:45
 * @version: 1.0
 */
@Controller
public class RequestMappingController {
    @RequestMapping(
            value = {"/testRequestMapping", "/test"},
            method = {RequestMethod.GET,RequestMethod.POST}
            )
    public String target() {
        return "success";
    }

    @GetMapping("/testGetMapping")
    public String testGetMapping(){
        return "success";
    }
    @RequestMapping(
            value = "/testParamsAndHeaders",
            params = {"username"}
    )
    public String testParamsAndHeaders(){
        return "success";
    }
//    @RequestMapping(value = "/a?a/testAnt")
@RequestMapping(value = "/**/testAnt")
    public String testAnt(){
        return "success";
    }
    @RequestMapping("/testPath/{id}/{username}")
    public String testPath(@PathVariable("id")Integer id,@PathVariable("username") String username){
        System.out.println("id:"+id+"username:"+username);
        return "success";
    }

}

