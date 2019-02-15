package com.cvbank.application.DTO;

import lombok.Data;

import java.time.LocalDate;

@Data
abstract class RegistrationRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private LocalDate birthday;

    RegistrationRequest() {
    }

    RegistrationRequest(String firstName, String lastName, String email, String phone, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
    }
}
