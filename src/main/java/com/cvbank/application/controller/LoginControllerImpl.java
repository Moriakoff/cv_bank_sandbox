package com.cvbank.application.controller;

import com.cvbank.application.DTO.login.LoginRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginControllerImpl{

    @PostMapping("/login")
    public void login(@RequestBody LoginRequest request) {

    }

    @PostMapping("/logout")
    public void logout(@RequestHeader("token") String token) {

    }
}
