package com.cvbank.application.controller;

import com.cvbank.application.DTO.registration.RegistrationRequestHunter;
import com.cvbank.application.DTO.registration.RegistrationRequestSeeker;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public class RegistrationControllerImpl{

    @PostMapping
    public void RegistrationSeeker(@RequestBody RegistrationRequestSeeker request) {

    }

    @PostMapping
    public void RegistrationHunter(@RequestBody RegistrationRequestHunter request) {

    }
}
