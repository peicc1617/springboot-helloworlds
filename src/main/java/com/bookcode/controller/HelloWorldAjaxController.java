package com.bookcode.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

/**
 * @基本功能:Aja请求接口
 * @program:springboot-helloworlds
 * @author:peicc
 * @create:2019-12-20 15:01:50
 **/
@RestController
@RequestMapping("/ajax")
public class HelloWorldAjaxController {
    @PostMapping ("/hello")
    @ResponseBody
    public String say(){
        return "ajax";
    }
}
