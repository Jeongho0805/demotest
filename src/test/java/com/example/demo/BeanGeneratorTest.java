package com.example.demo;

import com.example.demo.bean.AAA;
import com.example.demo.bean.BBB;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanGeneratorTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext("com.example.demo.controller");

    @Test
    void beanTest() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);

            if (beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
                Object bean = ac.getBean(beanDefinitionName);
                System.out.println("beanDefinitionName = " + beanDefinitionName + " bean = " + bean);
                if (beanDefinitionName.equals("AAA")) {
                    AAA aaa = (AAA) bean;
                    System.out.println(aaa.getObjectMapper());
                }
                if (beanDefinitionName.equals("BBB")) {
                    BBB bbb = (BBB) bean;
                    System.out.println(bbb.getObjectMapper());
                }
            }
        }
    }

    @Test
    void ComponentTest() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);
            if (beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
                Object bean = ac.getBean(beanDefinitionName);
                System.out.println("beanDefinitionName = " + beanDefinitionName + " bean = " + bean);
            }
        }
    }
}
