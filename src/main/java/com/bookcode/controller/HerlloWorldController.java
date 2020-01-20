package com.bookcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @基本功能:
 * @program:springboot-helloworlds
 * @author:peicc
 * @create:2019-12-20 11:18:18
 **/
@Controller
public class HerlloWorldController {
    int a=0;
    boolean isAdding=true;
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello-World";
    }
    @GetMapping("/hi")
    public String hi(@RequestParam(name="name",required = false,defaultValue = "world")String name, Model model){
        model.addAttribute("name",name);
        return "hi";
    }
    @GetMapping("/hii")
    public String hii(){
        return "hii";
    }
    @GetMapping("/test")
    public String testString(){
        return "hii";
    }
    @GetMapping("/indextest")
    public String testIndex(){
        return "index";
    }
    @ResponseBody
    @GetMapping("/add")
    public void add(){
        while (isAdding){
            a++;
            System.out.println("循环中");
        }
        System.out.println("跳出循环");
    }
    @ResponseBody
    @RequestMapping ("/getA")
    @CrossOrigin
    public String getString(){
        isAdding=false;
        return "a的值为"+a;
    }
}
