package com.carrot.recell.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @RequestMapping("/hello")
    //@CrossOrigin("localhost:4200")
    public String hello(){
        return "sayHello";
    }

}
