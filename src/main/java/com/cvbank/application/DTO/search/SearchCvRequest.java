package com.cvbank.application.DTO.search;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SearchCvRequest {

    //It's Request that used by HH in search

    @NotBlank
    private String position;

    @NotBlank
    private String profArea;

    @NotBlank
    private List <String> regions;

    @NotBlank
    private List <String> skills;

    @Positive
    private Double minSalary;

    @Positive
    private Double maxSalary;

    @NotBlank
    private String city;

    @NotBlank
    private String citizenship; //todo think about Type

}
