package com.droolsEngine.demo.service;

import com.droolsEngine.demo.dao.Product;
import com.droolsEngine.demo.dao.TestDao;
import com.droolsEngine.demo.dao.UserDao;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessRule {

    @Autowired
    private KieContainer kieContainer;

    public void userKieService(UserDao userDao)
    {
        KieSession kieSession = kieContainer.newKieSession("userRulesSession");
        kieSession.insert(userDao);
        kieSession.fireAllRules();
        kieSession.dispose();
    }

    public void testKieService(TestDao testDao)
    {
        KieSession kieSession = kieContainer.newKieSession("testRulesSession");

        for(Product product : testDao.getProducts())
        {
            kieSession.insert(product);
        }

        kieSession.fireAllRules();
        kieSession.dispose();
    }

    public void programKieService(UserDao userDao)
    {
        KieSession kieSession = kieContainer.newKieSession("programRulesSession");
        kieSession.insert(userDao);
        kieSession.fireAllRules();
        kieSession.dispose();
    }

}
