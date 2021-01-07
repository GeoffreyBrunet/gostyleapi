package com.thegeoffreybrunet.gostyleapi.controllers;

import com.thegeoffreybrunet.gostyleapi.model.Promotion;
import com.thegeoffreybrunet.gostyleapi.repository.PromotionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@CrossOrigin
public class PromotionController {

    @Autowired
    PromotionsRepository promotionsRepository;

    @GetMapping("/api/promotions/{qrcodeAcquired}")
    public Promotion getPromotion(@PathVariable String qrcodeAcquired) {
        Promotion promotionData = promotionsRepository.findByQrcodePromoEquals(qrcodeAcquired);
        return promotionData;
    }

}
