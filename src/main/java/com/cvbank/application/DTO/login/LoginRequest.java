package com.cvbank.application.DTO.login;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginRequest {

    @Email
    private String login;

    @NotBlank
    private String password;

}
