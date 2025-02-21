package com.bridgelabz.kanak.springmessageapp.controller;

import com.bridgelabz.kanak.springmessageapp.dto.User;
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

    // Post method
    @PostMapping("/hello/post")
    public String sayHelloUsingPost(@RequestBody User user){
        return "Hello "+user.getFirst_name()+" "+user.getLast_name()+" from BridgeLabz";
    }


}
