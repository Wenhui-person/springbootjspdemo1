package cn.edu.sdut.springbootjspdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    //模拟servlet
    @RequestMapping("/")
    public String toLogin(){
        //方法的返回值按照springMVC要求，是jsp的页面名称
        return "index";
    }

    @RequestMapping("main")
    public String toMain(){
        return "main";
    }
}
