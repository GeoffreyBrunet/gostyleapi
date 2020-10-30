package com.thegeoffreybrunet.gostyleapi.web.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HomeController {

    @GetMapping("/")
    public String getHelloWorld(){
        return "Welcome on Gostyle APIs.\n";
    }

}
