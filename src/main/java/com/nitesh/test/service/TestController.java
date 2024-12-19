package com.nitesh.test.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-service/api")
public class TestController {

    @GetMapping("/test")
    public String getResponse(){
        return "Yes I am working...";
    }


    @GetMapping("/test1")
    public String getResponse2(){
        return "Yes I am also working...";
    }
}
