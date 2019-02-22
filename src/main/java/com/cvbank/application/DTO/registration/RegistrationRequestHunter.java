package com.cvbank.application.DTO.registration;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
public class RegistrationRequestHunter extends RegistrationRequest {

    /*
     *
     * add fields
     *
     *
     * */


    public RegistrationRequestHunter() {
    }

    @Builder // TODO: Refactoring constructor
    public RegistrationRequestHunter(String firstName, String lastName, String email, String phone, LocalDate birthday) {
        super(firstName, lastName, email, phone, birthday);
    }
}
