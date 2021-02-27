package com.thegeoffreybrunet.gostyleapi.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class PromotionTest {
    @Mock
    Product product;
    @InjectMocks
    Promotion promotion;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testToString() {
        String result = promotion.toString();
        Assertions.assertEquals("Promotion{idPromo=0, tauxPromotion='null', qrcodePromo='null', productId=0, product=product}", result);
    }
}
