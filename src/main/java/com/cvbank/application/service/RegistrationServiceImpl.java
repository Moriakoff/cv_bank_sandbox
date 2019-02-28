package com.cvbank.application.service;

import com.cvbank.application.DTO.registration.RegistrationRequest;
import com.cvbank.application.entity.User;
import com.cvbank.application.repository.UserRepository;
import com.cvbank.application.service.mail.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    EmailService emailService;

    @Override
    public void registration(RegistrationRequest request) {

        if (userRepository.existsByEmail(request.getEmail())) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "This login is already in used");
        }

        if (!request.getPassword().equals(request.getConfirmPassword())) {
            throw new ResponseStatusException(HttpStatus.FORBIDDEN, "Passwords don't same");
        }

        User user = User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .birthday(request.getBirthday())
                .email(request.getEmail())
                .phone(request.getPhone())
                .city(request.getCity())
                .build();

        userRepository.save(user);

        emailService.sendRegistrationMessage(user.getEmail());
    }
}
