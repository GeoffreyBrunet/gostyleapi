package com.thegeoffreybrunet.gostyleapi.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
//import static org.mockito.Mockito.*;
class ProductControllerTest {
    @Mock
    com.thegeoffreybrunet.gostyleapi.repository.ProductRepository productRepository;
    @InjectMocks
    com.thegeoffreybrunet.gostyleapi.controllers.ProductController productController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetProduct(){
        when(productRepository.findAll()).thenReturn(java.util.Arrays.<com.thegeoffreybrunet.gostyleapi.model.Product>asList(new com.thegeoffreybrunet.gostyleapi.model.Product(0L, "productName", 0, "picture")));

        org.springframework.http.ResponseEntity<java.util.List<com.thegeoffreybrunet.gostyleapi.model.Product>> result = productController.getProduct();
        Assertions.assertEquals(null, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme