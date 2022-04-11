package com.aiguigu.mvc.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/**
 * @projectName: SpringMVC
 * @package: com.aiguigu.mvc.controller
 * @className: FileUpAndDownController
 * @author: jhb
 * @description: TODO
 * @date: 2022/2/23 21:15
 * @version: 1.0
 */
@Controller
public class FileUpAndDownController {
    @RequestMapping("/testDown")
    public ResponseEntity<byte[]> testResponseEntity(HttpSession session) throws IOException {
        //获取ServletContext对象
        ServletContext servletContext = session.getServletContext();
        //获取服务器中文件的真实路径/获取参数对应文件在服务器的路径，这里的文件名不要写死，可以用变量拼接字符串
        String realPath = servletContext.getRealPath("/static/img/wwww.jpg");
        //创建输入流
        InputStream is = new FileInputStream(realPath);
        //创建字节数组
        byte[] bytes = new byte[is.available()];//available方法获取输入流对应文件的字节数
        //将流读到字节数组中
        is.read(bytes);
        //创建HttpHeaders对象设置响应头信息
        MultiValueMap<String, String> headers = new HttpHeaders();
        //设置要下载方式以及下载文件的名字
        headers.add("Content-Disposition", "attachment;filename=wwww.jpg");//wwww.jpg也要改成活的，用变量拼串
        //设置相应状态码
        HttpStatus statusCode = HttpStatus.OK;
        //创建ResponseEntity对象/bytes相当于响应体，headers响应头，statusCode响应码
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<byte[]>(bytes, headers, statusCode);
        //关闭输入流
        is.close();
        return responseEntity;
    }
    @RequestMapping("/testUp")
    public String testUp(MultipartFile photo,HttpSession session) throws IOException {
        String fileName = photo.getOriginalFilename();//获取上传文件的文件名
        ServletContext servletContext = session.getServletContext();//获取servletContext对象
        //获取上传的文件的后缀名
        String suffixName=fileName.substring(fileName.lastIndexOf("."));
        //将UUID作为文件名
        String uuid= UUID.randomUUID().toString();
        //将uuid和后缀名拼接后的结果作为最终的文件名
        fileName=uuid+suffixName;
        String photoPath = servletContext.getRealPath("photo");//获取服务器中photo目录的路径
        //创建文件路径
        File file=new File(photoPath);
        //判断photoPath所对应路径是否存在
        if (file.exists()){
            //存在
        }else {
            //不存在
            file.mkdir();
        }
        String finalPath=photoPath+File.separator+fileName;//File.separator代表文件分隔符//这里获取文件的全路径
        photo.transferTo(new File(finalPath));//标识文件转移，也就是上传
        return "success";
    }
}
