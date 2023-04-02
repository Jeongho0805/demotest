package com.example.demo.bean;

import com.fasterxml.jackson.databind.ObjectMapper;

public class AAA {

    private final ObjectMapper objectMapper;

    public AAA(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }
}
