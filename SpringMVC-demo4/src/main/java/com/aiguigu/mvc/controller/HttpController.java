package com.aiguigu.mvc.controller;

import com.aiguigu.mvc.bean.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.geom.Arc2D;
import java.io.IOException;

/**
 * @projectName: SpringMVC
 * @package: com.aiguitu.mvc.controller
 * @className: HttpController
 * @author: jhb
 * @description: TODO
 * @date: 2022/2/23 17:50
 * @version: 1.0
 */
@Controller
public class HttpController {
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody) {
        System.out.println("RequestBody" + requestBody);
        return "success";
    }

    @RequestMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity) {
        System.out.println("请求头:" + requestEntity.getHeaders());
        System.out.println("请求体:" + requestEntity.getBody());
        return "success";
    }

    @RequestMapping("/testResponse")
    public void testResponse(HttpServletResponse response) throws IOException {
        response.getWriter().println("helloResponse");
    }

    @RequestMapping("/testResponseBody")
    @ResponseBody//表示控制器方法
    public String testResponseBody() {
        return "success";
    }

    @RequestMapping("/testResponseUser")
    @ResponseBody//表示控制器方法
    public User testResponseUser() {
        return new User(1001,"admin","123456",23,"男");
    }
    @RequestMapping("/testAxios")
    @ResponseBody
  public String testAxios(String username,String password){
        System.out.println(username+","+password);
        return "hello,axios";
  }
  @RequestMapping("/test")
    public String test(String username,String password){
      System.out.println(username);
      System.out.println(password);
      return "success";
  }
}
