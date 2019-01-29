package com.taoj.controller;

import com.taoj.entity.Student;
import com.taoj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    private StudentService service;

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "hello world";
    }

    @RequestMapping("/find")
    @ResponseBody
    public String find(){
        Student stu = new Student();
        stu = service.findOneStu(1001);
        return stu.toString();
    }

}
