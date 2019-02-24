package com.cvbank.application.DTO.cv;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProjectDto {

    private LocalDate from;
    private LocalDate to;
    private String position;
    private String company;
    private String locale;
    private String info;


}
