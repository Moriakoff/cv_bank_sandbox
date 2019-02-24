package com.cvbank.application.controller;

import com.cvbank.application.DTO.login.LoginRequest;
import com.cvbank.application.DTO.login.LoginResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class LoginController {

    @PostMapping("/login")
    public LoginResponse login(@RequestBody @Valid LoginRequest request) {
        return null;

    }

    @PostMapping("/logout/")
    public void logout(@RequestHeader("token") String token) {

    }

}
