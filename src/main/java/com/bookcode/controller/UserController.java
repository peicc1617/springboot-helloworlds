package com.bookcode.controller;

import com.bookcode.model.User;
import com.bookcode.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @基本功能:
 * @program:springboot-helloworlds
 * @author:peicc
 * @create:2019-12-23 12:23:16
 **/
@Controller
@RequestMapping(path = "/demo")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    //根据用户名和邮件向数据库插入一条记录
    @PostMapping(path = "/add")
    public @ResponseBody String addUser(@RequestParam String name, @RequestParam String email){
        User user=new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        return "Saved";
    }
    //返回数据库所有记录
    @RequestMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUSers(){
        return userRepository.findAll();
    }
    @RequestMapping(path="/findById")
    public @ResponseBody User findById(@RequestParam int id){
        return userRepository.findById(id);
    }
}
