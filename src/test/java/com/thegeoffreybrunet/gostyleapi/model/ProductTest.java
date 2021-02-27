package com.thegeoffreybrunet.gostyleapi.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductTest {
    Product product = new Product(0L, "productName", 0, "picture");

    @Test
    void testToString() {
        String result = product.toString();
        Assertions.assertEquals("Product{idProduct=0, productName='productName', price=0, picture='picture'}", result);
    }
}
