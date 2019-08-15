package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("demo")
public class DemoController {

    @PostMapping
    public DemoRequest post(@Valid DemoRequest demoRequest){
        System.out.println("Sample post");
        return demoRequest;
    }

    @GetMapping
    public void get(){
        System.out.println("Sample get");
    }
}
