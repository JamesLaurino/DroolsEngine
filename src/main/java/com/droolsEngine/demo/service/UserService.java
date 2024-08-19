package com.droolsEngine.demo.service;

import com.droolsEngine.demo.dao.ProgramDao;
import com.droolsEngine.demo.dao.UserDao;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private KieContainer kieContainer;

    public UserDao insertUser(UserDao userDao) {
        ProgramDao programDao = new ProgramDao();
        KieSession kieSession = kieContainer.newKieSession();
        //kieSession.setGlobal("programDao", programDao);
        kieSession.insert(userDao);
        kieSession.fireAllRules();
        kieSession.dispose();
        return userDao;
    }

}
