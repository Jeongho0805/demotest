package com.example.demo.bean;

import com.fasterxml.jackson.databind.ObjectMapper;

public class BBB {

    private final ObjectMapper objectMapper;

    public BBB(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }
}