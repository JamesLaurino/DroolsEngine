package com.droolsEngine.demo.config;

import com.droolsEngine.demo.dao.UserDao;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DroolsConfig {

    @Bean
    public KieContainer kieContainer() {

        return KieServices.Factory.get().getKieClasspathContainer();
    }
}