package com.example.demo.bean;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanGenerator {

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public AAA AAA() {
        return new AAA(objectMapper());
    }

    @Bean
    public BBB BBB() {
        return new BBB(objectMapper());
    }
}
