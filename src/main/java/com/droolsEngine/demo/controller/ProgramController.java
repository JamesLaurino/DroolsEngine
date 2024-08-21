package com.droolsEngine.demo.controller;

import com.droolsEngine.demo.dao.UserDao;
import com.droolsEngine.demo.service.ProgramService;
import com.droolsEngine.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/program")
public class ProgramController
{
    @Autowired
    private ProgramService programService;

    @GetMapping
    public String getUser()
    {
        return "All programs";
    }

    @PostMapping
    public UserDao inserUser(@RequestBody UserDao userDao)
    {
        programService.insertProgram(userDao);
        return userDao;
    }
}
