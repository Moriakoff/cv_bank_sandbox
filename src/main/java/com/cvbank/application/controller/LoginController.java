package com.cvbank.application.controller;

import com.cvbank.application.DTO.LoginRequest;

public interface LoginController {
    void login(LoginRequest request);

    void logout(String token);
}
