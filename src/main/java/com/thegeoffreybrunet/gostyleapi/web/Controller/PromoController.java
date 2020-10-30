package com.thegeoffreybrunet.gostyleapi.web.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class PromoController {

    @GetMapping("/api/promotions")
    public String showPromotions(){
        return "item";
    }

}
