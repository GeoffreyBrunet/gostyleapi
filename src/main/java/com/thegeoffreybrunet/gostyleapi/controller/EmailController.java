package com.thegeoffreybrunet.gostyleapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @GetMapping("/api/email")
    public String getEmail(){
        return "email";
    }

}
