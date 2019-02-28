package com.cvbank.application.service.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService{

    private final String REGISTRATION_SUBJECT = "Registration on CV Bank";
    private final String REGISTRATION_TEXT = "Thank you for your choice";

    @Autowired
    public JavaMailSender mailSender;

    @Override
    public void sendRegistrationMessage(String to) {
        SimpleMailMessage msg = new SimpleMailMessage();

        msg.setTo(to);
        msg.setText(REGISTRATION_TEXT);
        msg.setSubject(REGISTRATION_SUBJECT);

        mailSender.send(msg);
    }
}
