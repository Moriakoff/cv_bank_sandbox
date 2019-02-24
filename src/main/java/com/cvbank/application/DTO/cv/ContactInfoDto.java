package com.cvbank.application.DTO.cv;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactInfoDto {

    @NotBlank
    private String phone;

    @Email
    private String email;

    @NotBlank
    private String city;

    @Past
    private LocalDate birthday;

    @NotBlank
    private String citizenship;
}
