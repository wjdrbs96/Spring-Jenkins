package com.example.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by jg 2021/05/14
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "DDD ~~~";
    }
}
