package com.thegeoffreybrunet.gostyleapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PromoController {

    @GetMapping("/api/promotions")
    public String showPromotions(){
        return "promotions";
    }

}
