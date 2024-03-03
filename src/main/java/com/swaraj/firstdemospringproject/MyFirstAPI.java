package com.swaraj.firstdemospringproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstAPI {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello SpringBoot";
    }

    @RequestMapping("/hello/{nameOfPerson}")
    public String sayHelloToPerson(@PathVariable("nameOfPerson") String nameOfPerson){
        return "Welcome to SpringBoot API - " + nameOfPerson;
    }
}
