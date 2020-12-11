package com.thegeoffreybrunet.gostyleapi.web.Controller;

import com.thegeoffreybrunet.gostyleapi.model.Email;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class EmailController {

    @GetMapping("/api/email")
    public Email getEmail(){
        Email email = new Email("geoffrey.brunet@icloud.com");
        return email;
    }

}
