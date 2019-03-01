package com.cvbank.application.DTO.cv;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class СvResponse {

    //This DTO used by HH in search and this DTO return in methods GetCV...
    // First chapter of CvDTO

    private String userName;

    private String phone;

    private String email;

    private String position;

    private String summary;

    private String city;

    private Integer age;

    private List <String> skills;
}
