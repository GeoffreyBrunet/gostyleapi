package com.thegeoffreybrunet.gostyleapi.controllers;

import com.thegeoffreybrunet.gostyleapi.model.Email;
import com.thegeoffreybrunet.gostyleapi.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@CrossOrigin
class EmailController {

    @Autowired
    EmailRepository emailRepository;

    @PostMapping("/api/email")
    public ResponseEntity<Email> addEmail(@RequestBody Email email){
        Email emailData = emailRepository.save(email);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(emailData.getEmailAddress()).toUri();
        return ResponseEntity.created(location).build();
    }

}
