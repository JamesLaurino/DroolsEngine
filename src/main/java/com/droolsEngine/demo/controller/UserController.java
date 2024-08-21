package com.droolsEngine.demo.controller;

import com.droolsEngine.demo.dao.UserDao;
import com.droolsEngine.demo.service.UserService;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


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
        userService.inserUser(userDao);
        return userDao;
    }
}
