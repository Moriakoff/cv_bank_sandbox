package com.cvbank.application.DTO.cv;

import lombok.*;

import javax.validation.constraints.Email;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactInfoDto {
    private String phone;

    @Email
    private String email;

    private String city;

    private LocalDate birthday;

    private String citizenship;
}
