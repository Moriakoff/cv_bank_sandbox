package com.cvbank.application.controller;

import com.cvbank.application.DTO.RegistrationRequestHunter;
import com.cvbank.application.DTO.RegistrationRequestSeeker;

public interface RegistrationController {

    void RegistrationSeeker(RegistrationRequestSeeker request);

    void RegistrationHunter(RegistrationRequestHunter request);
}
