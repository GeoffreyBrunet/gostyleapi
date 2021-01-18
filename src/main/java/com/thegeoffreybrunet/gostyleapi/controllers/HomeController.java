package com.thegeoffreybrunet.gostyleapi.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
class HomeController {

    @GetMapping("/")
    public String getHelloWorld(){
        return "Welcome on Gostyle APIs.";
    }

}
