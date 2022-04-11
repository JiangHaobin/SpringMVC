package com.atguigu.mvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @projectName: SpringMVC
 * @package: com.atguigu.mvc.controller
 * @className: ExceptionController
 * @author: jhb
 * @description: TODO
 * @date: 2022/2/25 2:57
 * @version: 1.0
 */
@ControllerAdvice//将当前类标识为异常处理的组件
public class ExceptionController {
    //用于设置所标识方法处理的异常，value标识可以是很多个异常的数组
    @ExceptionHandler(value = {ArithmeticException.class,NullPointerException.class})
    public String ExceptionController(Exception ex, Model model){
        //ex标识当前请求处理中出现的异常对象
        model.addAttribute("ex",ex);
        return "error";
    }
}
