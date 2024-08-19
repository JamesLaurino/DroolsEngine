package com.droolsEngine.demo.controller;

import com.droolsEngine.demo.dao.UserDao;
import com.droolsEngine.demo.service.DateSerializer;
import com.droolsEngine.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


@RestController
public class UserController
{
    @Autowired
    private UserService userService;

    @GetMapping
    public String getUser()
    {
        return "All users";
    }

    @PostMapping
    public UserDao inserUser(@RequestBody UserDao userDao)
    {
        return this.userService.insertUser(userDao);
    }
}
