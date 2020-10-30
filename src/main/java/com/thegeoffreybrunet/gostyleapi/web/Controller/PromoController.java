package com.thegeoffreybrunet.gostyleapi.web.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class PromoController {

    @GetMapping("/api/promotions")
    public Item showPromotions(){
        Item item = new Item(1, new String("sneakers"), new String("picture"), 199.99);
        return item;
    }

}
