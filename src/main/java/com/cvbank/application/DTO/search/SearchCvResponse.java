package com.cvbank.application.DTO.search;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SearchCvResponse {

    private String userName;
    private String phone;
    private String email;
    private String position;
    private String city;
    private Integer age;
    private List <String> skills;
}
