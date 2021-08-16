package com.lydia.springboot;

import com.lydia.springboot.model.ExampleData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/msg")
    public ExampleData msg() {
        ExampleData hello = ExampleData.builder().msg("hello").build();
        System.out.println();
        return hello;
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}