package com.haili.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @Value("${server.port}")
    private int port;

    public String index(){
        return "hello + Port: " + port;
    }
}
