package com.thegeoffreybrunet.gostyleapi.controllers;

import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.when;

import com.thegeoffreybrunet.gostyleapi.model.Product;
import com.thegeoffreybrunet.gostyleapi.model.Promotion;
import com.thegeoffreybrunet.gostyleapi.repository.PromotionsRepository;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {PromotionController.class})
@ExtendWith(SpringExtension.class)
public class PromotionControllerTest {
    @Autowired
    private PromotionController promotionController;

    @MockBean
    private PromotionsRepository promotionsRepository;

    @Test
    public void testGetPromotion() throws Exception {
        Product product = new Product();
        product.setPicture("Picture");
        product.setIdProduct(1L);
        product.setProductName("Product Name");
        product.setPrice(1);

        Promotion promotion = new Promotion();
        promotion.setProduct(product);
        promotion.setIdPromo(1L);
        promotion.setTauxPromotion("Taux Promotion");
        promotion.setProductId(123);
        promotion.setQrcodePromo("Qrcode Promo");
        when(this.promotionsRepository.findByQrcodePromoEquals(anyString())).thenReturn(promotion);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/promotions/{qrcodeAcquired}",
                "value");
        MockMvcBuilders.standaloneSetup(this.promotionController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(Matchers.containsString(
                                "{\"idPromo\":1,\"tauxPromotion\":\"Taux Promotion\",\"qrcodePromo\":\"Qrcode Promo\",\"productId\":123,\"product\""
                                        + ":{\"idProduct\":1,\"productName\":\"Product Name\",\"price\":1,\"picture\":\"Picture\"}}")));
    }
}

