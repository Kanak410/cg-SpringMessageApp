package com.bridgelabz.kanak.springmessageapp.controller;

import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/hello/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }

}
