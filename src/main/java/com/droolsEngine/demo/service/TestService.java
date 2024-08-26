package com.droolsEngine.demo.service;


import com.droolsEngine.demo.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService
{
    @Autowired
    BusinessRule businessRule;

    public void testDrool(TestDao testDao)
    {
        businessRule.testKieService(testDao);
    }
}
