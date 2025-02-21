package com.bridgelabz.kanak.springmessageapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello ";
    }
    @GetMapping("/hello/query")
    public String sayHello(@RequestParam(name = "name", defaultValue = "Guest") String name){
        return "Hello "+name+" from BridgeLabz";
    }

    //passing name as path variable
    @GetMapping("hello/param/{name}")
    public String sayHelloUsingPathVariable(@PathVariable String name){
        return "Hello "+name+" from BridgeLabz";
    }

}
