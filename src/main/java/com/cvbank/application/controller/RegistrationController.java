package com.cvbank.application.controller;

import com.cvbank.application.DTO.registration.RegistrationRequest;
import com.cvbank.application.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService123;

    @PostMapping
    public void RegistrationSeeker(@RequestBody RegistrationRequest request) {
        registrationService.registration(request);
    }

}
