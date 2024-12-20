package com.nitesh.test.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-service/api")
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<String> getResponse(){
        return ResponseEntity.status(HttpStatus.OK).body("Yes I am working...");
    }


    @GetMapping("/test1")
    public ResponseEntity<String> getResponse2(){
        return ResponseEntity.status(HttpStatus.OK).body("Yes I am also working...");
    }
}
