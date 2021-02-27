package com.thegeoffreybrunet.gostyleapi.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
//import static org.mockito.Mockito.*;
class EmailControllerTest {
    @Mock
    com.thegeoffreybrunet.gostyleapi.repository.EmailRepository emailRepository;
    @InjectMocks
    com.thegeoffreybrunet.gostyleapi.controllers.EmailController emailController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testAddEmail(){
        org.springframework.http.ResponseEntity<com.thegeoffreybrunet.gostyleapi.model.Email> result = emailController.addEmail(new com.thegeoffreybrunet.gostyleapi.model.Email(0L, "emailAddress"));
        Assertions.assertEquals(null, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme