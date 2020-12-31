package com.thegeoffreybrunet.gostyleapi.controllers;

import com.thegeoffreybrunet.gostyleapi.model.Email;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
class EmailController {

    @PutMapping("/api/email")
    public String getEmail(){
        String email="toto";
        return email;
    }

}
