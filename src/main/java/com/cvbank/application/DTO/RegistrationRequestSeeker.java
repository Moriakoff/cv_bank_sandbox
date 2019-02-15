package com.cvbank.application.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
public class RegistrationRequestSeeker extends RegistrationRequest {

    /*
     *
     * add fields
     *
     *
     * */

    public RegistrationRequestSeeker() {
    }


    @Builder // TODO: Refactoring constructor
    public RegistrationRequestSeeker(String firstName, String lastName, String email, String phone, LocalDate birthday) {
        super(firstName, lastName, email, phone, birthday);
    }
}
