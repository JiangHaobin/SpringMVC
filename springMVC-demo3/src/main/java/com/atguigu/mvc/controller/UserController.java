package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @projectName: SpringMVC
 * @package: com.atguigu.mvc.controller
 * @className: UserController
 * @author: jhb
 * @description: TODO
 * @date: 2022/2/21 16:30
 * @version: 1.0
 */
@Controller
public class UserController {
    /**
     * 使用RESTFul模拟用户资源的增删改查
     * /user    GET查询所有用户信息
     * /user/1    GET根据用户ID用户信息
     * /user    POST添加用户信息
     * /user/1    DELETE 删除用户信息
     * /user    PUT修改用户信息
     * /user    GET查询所有用户信息
     */
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getAllUser(){
        System.out.println("查询所有用户信息");
        return "success";
    }
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String getUserById(@PathVariable("id")Integer id){
        System.out.println("查询到"+id+"的信息");
        return "success";
    }
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String insertUser(String username,String password){
        System.out.println("添加用户信息"+username+"   "+password);
        return "success";
    }
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String updateUser(String username,String password){
        System.out.println("修改用户信息"+username+"   "+password);
        return "success";
    }
}
