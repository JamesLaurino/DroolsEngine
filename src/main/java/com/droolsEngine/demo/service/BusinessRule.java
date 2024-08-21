package com.droolsEngine.demo.service;

import com.droolsEngine.demo.dao.UserDao;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public void programKieService(UserDao userDao)
    {
        KieSession kieSession = kieContainer.newKieSession("programRulesSession");
        kieSession.insert(userDao);
        kieSession.fireAllRules();
        kieSession.dispose();
    }

}
