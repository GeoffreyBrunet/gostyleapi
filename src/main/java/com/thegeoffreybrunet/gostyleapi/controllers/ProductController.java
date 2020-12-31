package com.thegeoffreybrunet.gostyleapi.controllers;

import com.thegeoffreybrunet.gostyleapi.model.Product;
import com.thegeoffreybrunet.gostyleapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/api/product")
    public ResponseEntity<List<Product>> getProduct(){
        List<Product> products = new ArrayList<Product>();
        productRepository.findAll().forEach(products::add);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}