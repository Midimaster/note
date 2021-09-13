package com.note.miaosha.controller;

import com.note.miaosha.domain.User;
import com.note.miaosha.result.Result;
import com.note.miaosha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 18530
 */
@RestController
@RequestMapping("/test")
public class MiaoshaController {

    @Autowired
    UserService userService;

    @RequestMapping("/test")
    public Result test() {
        return Result.success("hello");
    }

    @GetMapping("getUserById")
    public Result<User> getUser(){
        User user = userService.getUserById(1);
        return Result.success(user);
    }

}
