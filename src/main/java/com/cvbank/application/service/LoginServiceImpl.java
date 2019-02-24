package com.cvbank.application.service;

import com.cvbank.application.DTO.login.LoginRequest;
import com.cvbank.application.DTO.login.LoginResponse;
import com.cvbank.application.entity.User;
import com.cvbank.application.entity.UserSession;
import com.cvbank.application.repository.UserRepository;
import com.cvbank.application.repository.UserSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.UUID;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserSessionRepository userSessionRepository;

    @Override
    public LoginResponse login(LoginRequest request) {
        User user = userRepository.findUserByEmail(request.getLogin());

        if (user == null) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Login or password incorrectly");
        }

        UserSession userSession = UserSession.builder()
                .user(user)
                .token(UUID.randomUUID().toString())
                .isValid(true)
                .build();

        return new LoginResponse(userSession.getToken());
    }

    @Override
    public void logout(String token) {

        UserSession session = userSessionRepository.findUserSessionByToken(token);

        session.setValid(false);

        userSessionRepository.save(session);

    }
}
