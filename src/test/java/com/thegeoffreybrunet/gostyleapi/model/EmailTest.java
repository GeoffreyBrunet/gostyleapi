package com.thegeoffreybrunet.gostyleapi.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmailTest {
    Email email = new Email(0L, "emailAddress");

    @Test
    void testToString() {
        String result = email.toString();
        Assertions.assertEquals("Email{idEmail=0, emailAddress='emailAddress'}", result);
    }
}