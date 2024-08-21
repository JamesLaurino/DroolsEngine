package com.droolsEngine.demo.service;

import com.droolsEngine.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramService
{
    @Autowired
    BusinessRule businessRule;

    public void insertProgram(UserDao userDao)
    {
        businessRule.programKieService(userDao);
    }
}
