package com.droolsEngine.demo.controller;

import com.droolsEngine.demo.dao.TestDao;
import com.droolsEngine.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testServiceService;


    @PostMapping
    public String insertTest(@RequestBody TestDao testDao)
    {
        testServiceService.testDrool(testDao);
        return "Insertion réussie";
    }
}
