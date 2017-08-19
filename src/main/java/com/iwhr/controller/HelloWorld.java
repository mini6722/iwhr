package com.iwhr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LHT
 * @Description: test
 * @create 2017-08-15 10:34
 **/
@RestController
public class HelloWorld {
    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }
}
