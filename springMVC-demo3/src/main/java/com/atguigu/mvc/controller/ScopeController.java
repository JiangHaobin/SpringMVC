package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sun.java2d.pipe.SolidTextRenderer;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.PublicKey;
import java.util.Map;

/**
 * @projectName: SpringMVC
 * @package: com.atguigu.mvc.controller
 * @className: ScopeController
 * @author: jhb
 * @description: TODO
 * @date: 2022/2/19 19:42
 * @version: 1.0
 */
@Controller
public class ScopeController {
//    使用servletAPI向request域对象共享数据
    @RequestMapping("/testRequestByServletAPI")
    public String testRequestByServletAPI(HttpServletRequest request){
        request.setAttribute("testRequestScope","hello,ServletAPI");
        return "success";
    }
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView mav=new ModelAndView();
        //处理模型数据，即向请求域request共享数据
        mav.addObject("testRequestScope","hello,ModelAndView");
        //设置视图名称,相当于之前控制器的字符串返回值，意思是告诉前端控制你应该返回到哪个页面
        mav.setViewName("success");
        return mav;

    }
    @RequestMapping("/testModel")
    public String testModel(Model model){
        model.addAttribute("testRequestScope","hello,model");
       return "success";

    }
    @RequestMapping("/testMap")
    public String testMap(Map<String,Object> map){
        map.put("testRequestScope","hello,Map");
        return "success";
    }
    @RequestMapping("/testModelMap")
     public String testModelMap(ModelMap modelMap){
        modelMap.addAttribute("testRequestScope","hello,modelmap");
        return "success";
    }
    @RequestMapping("/testSession")
    public String testSession(HttpSession session){
        session.setAttribute("testSessionScope","hello,session");
        return "success";
    }
    @RequestMapping("/testApplication")
    public String testApplication(HttpSession session){
        ServletContext application = session.getServletContext();
        application.setAttribute("testApplicationScope","hello,application");
     return "success";
    }
}
