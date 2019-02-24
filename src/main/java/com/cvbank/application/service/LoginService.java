package com.cvbank.application.service;

import com.cvbank.application.DTO.login.LoginRequest;
import com.cvbank.application.DTO.login.LoginResponse;

public interface LoginService {

    LoginResponse login(LoginRequest request);

    void logout(String token);
}
