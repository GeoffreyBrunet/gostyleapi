package com.thegeoffreybrunet.gostyleapi.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
//import static org.mockito.Mockito.*;
class PromotionControllerTest {
    @Mock
    com.thegeoffreybrunet.gostyleapi.repository.PromotionsRepository promotionsRepository;
    @InjectMocks
    com.thegeoffreybrunet.gostyleapi.controllers.PromotionController promotionController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetPromotion(){
        when(promotionsRepository.findByQrcodePromoEquals(anyString())).thenReturn(new com.thegeoffreybrunet.gostyleapi.model.Promotion(0L, "tauxPromotion", "qrcodePromo", 0, new com.thegeoffreybrunet.gostyleapi.model.Product(0L, "productName", 0, "picture")));

        com.thegeoffreybrunet.gostyleapi.model.Promotion result = promotionController.getPromotion("qrcodeAcquired");
        Assertions.assertEquals(new com.thegeoffreybrunet.gostyleapi.model.Promotion(0L, "tauxPromotion", "qrcodePromo", 0, new com.thegeoffreybrunet.gostyleapi.model.Product(0L, "productName", 0, "picture")), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme