package com.thegeoffreybrunet.gostyleapi.controllers;

import com.thegeoffreybrunet.gostyleapi.model.Promotion;
import com.thegeoffreybrunet.gostyleapi.repository.PromotionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@CrossOrigin
public class PromotionsController {

    @Autowired
    PromotionsRepository promotionsRepository;

    @GetMapping("/api/promotions/{id}")
    public ResponseEntity<Promotion> getPromotion(@PathVariable long id) {
        Optional<Promotion> promotionData = promotionsRepository.findById(id);
        if (!student.isPresent())
            throw new StudentNotFoundException("id-" + id);
        return student.get();
    }

}
