package com.cvbank.application.DTO.search;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SearchCvRequest {

    private String position;
    private String profArea;
    private List <String> regions;
    private List <String> skills;
    private Double minSalary;
    private Double maxSalary;
    private String city;
    private String citizenship; //todo think about Type

}
