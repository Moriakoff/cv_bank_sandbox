package com.cvbank.application.controller;

import com.cvbank.application.DTO.login.LoginRequest;
import com.cvbank.application.DTO.login.LoginResponse;
import com.cvbank.application.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public LoginResponse login(@RequestBody @Valid LoginRequest request) {
        return loginService.login(request);

    }

    @PostMapping("/logout/")
    public void logout(@RequestHeader("Authorization") String token) {
        loginService.logout(token);
    }

}
