package com.example.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloworldController {
    @GetMapping("/")
    public String getWelcomeText(){
        return "Hello World!";
    }

    @GetMapping ("/user")
    public String getName(){
        return "Rajitha Reddy";
    } 

}