package com.my.advance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.advance.entity.User;
import com.my.advance.service.UserService;

/*
 * 编写第一个controller
 */
@Controller
@RequestMapping("user")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    /*
     * 处理表单
     */
    @RequestMapping(value="/save")
    public String save(Long id, String name){
        User user = new User();
        user.setId(id);
        user.setName(name);
        
        userService.saveUser(user);
        System.out.println("save success");
        return null;
    }
    
    /*
     * 处理表单
     */
    @RequestMapping(value="/get")
    public String get(Long id){
        User user = userService.getUser(id);
        if (user != null) {
            System.out.println(user.toString());
        } else {
            System.out.println("查无此" + id + "的用户");
        }
        
        System.out.println("save success");
        return null;
    }
}
