package com.r2ducky.spring6di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello, I am the Controller.");

        return "Hello Everyone!!";
    }

}
