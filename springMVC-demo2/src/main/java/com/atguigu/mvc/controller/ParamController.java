package com.atguigu.mvc.controller;

import com.atguigu.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @projectName: SpringMVC
 * @package: com.atguigu.mvc.controller
 * @className: ParamController
 * @author: jhb
 * @description: TODO
 * @date: 2022/2/18 18:39
 * @version: 1.0
 */
@Controller
public class ParamController {
    @RequestMapping("/testServletAPI")
    //形参位置的request表示当前请求
    public String testServletAPI(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:"+username+"      password:"+password);
     return "success";
    }
    @RequestMapping("/testParam")
    public String testParam(@RequestParam("user_name") String username,
                            String password,
                            String[] hobby,
                            @RequestHeader("Host") String host){
        //多请求参数中出现多个同名的请求参数，可以再控制器方法的形参位置设置字符串类型或字符串数组接收此参数
        System.out.println("username:"+username+"      password:"+password+"    hobby:"+hobby[1]+"    host:"+host);
        return "success";
    }
    @RequestMapping("/testBean")

    public String testBean(User user){
        System.out.println(user);
        return "success";
    }
}
