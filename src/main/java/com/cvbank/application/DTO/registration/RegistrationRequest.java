package com.cvbank.application.DTO.registration;

import lombok.*;
import org.springframework.lang.NonNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegistrationRequest {

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @Email
    private String email;

    @NotBlank
    private String phone;

    @NotBlank
    private String city;

    @NonNull
    private LocalDate birthday;

    @NotBlank
    private String password;

    @NotBlank
    private String confirmPassword;

}
