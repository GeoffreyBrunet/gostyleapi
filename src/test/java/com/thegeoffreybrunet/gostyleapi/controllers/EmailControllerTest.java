package com.thegeoffreybrunet.gostyleapi.controllers;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thegeoffreybrunet.gostyleapi.model.Email;
import com.thegeoffreybrunet.gostyleapi.repository.EmailRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {EmailController.class})
@ExtendWith(SpringExtension.class)
public class EmailControllerTest {
    @Autowired
    private EmailController emailController;

    @MockBean
    private EmailRepository emailRepository;

    @Test
    public void testAddEmail() throws Exception {
        Email email = new Email();
        email.setIdEmail(1L);
        email.setEmailAddress("42 Main St");
        when(this.emailRepository.save((Email) any())).thenReturn(email);

        Email email1 = new Email();
        email1.setIdEmail(1L);
        email1.setEmailAddress("42 Main St");
        String content = (new ObjectMapper()).writeValueAsString(email1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api/email")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(this.emailController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.redirectedUrl("http://localhost/api/email/42%20Main%20St"));
    }
}

