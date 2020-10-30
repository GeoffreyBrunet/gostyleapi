package com.thegeoffreybrunet.gostyleapi.web.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class EmailController {

    @GetMapping("/api/email")
    public String getEmail(){
        return "email";
    }

}
