package com.example.myservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyServiceRest {

    @GetMapping("/")
    public String sayHello(){
        return "Hello";
    }

    @GetMapping("/hello/{name}")
    public String sayHelloTo(@PathVariable String name){
        return "Hello " + name;
    }

}
