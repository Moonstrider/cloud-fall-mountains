package com.cloud.fall.mountain.notebook_key_cloak.aop.security;

import java.util.Arrays;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class BeanCounter implements CommandLineRunner {

    private final ApplicationContext applicationContext;

    public BeanCounter(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public void run(String... args) {
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            if (beanName.contains("FilterChain")) {
                System.out.println("FilterChain:" + beanName);
            }
            if (beanName.contains("robert")) {
                System.out.println(beanName);
            }
        }
        System.out.println("Total Beans: " + beanNames.length);
    }
}
