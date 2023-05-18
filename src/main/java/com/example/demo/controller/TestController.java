package com.example.demo.controller;


import com.example.demo.aop.TimeLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @TimeLog
    @GetMapping("/example")
    public String example() throws InterruptedException {

        long begin = System.currentTimeMillis();

        Thread.sleep(1000);

        System.out.println(System.currentTimeMillis() - begin);
        return "테스트";
    }
}
