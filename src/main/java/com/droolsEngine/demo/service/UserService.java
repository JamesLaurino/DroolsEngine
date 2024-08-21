package com.droolsEngine.demo.service;


import com.droolsEngine.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    BusinessRule businessRule;

    public void inserUser(UserDao userDao)
    {
        businessRule.userKieService(userDao);
    }

}
