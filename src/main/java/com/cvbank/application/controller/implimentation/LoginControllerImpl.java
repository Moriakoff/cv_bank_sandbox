package com.cvbank.application.controller.implimentation;

import com.cvbank.application.DTO.LoginRequest;
import com.cvbank.application.controller.LoginController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginControllerImpl implements LoginController {

    @PostMapping("/login")
    public void login(@RequestBody LoginRequest request) {

    }

    @PostMapping("/logout")
    public void logout(@RequestHeader("token") String token) {

    }
}
