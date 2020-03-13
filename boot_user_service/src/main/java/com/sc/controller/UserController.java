package com.sc.controller;

import com.sc.entity.User;
import com.sc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    //根据用户ID查询用户信息
    @RequestMapping("/user/{userId}")
    @ResponseBody
    public User getUserById(@PathVariable("userId")Integer userId){
        User user = userService.getUserById(userId);
        return user;
    }
}
