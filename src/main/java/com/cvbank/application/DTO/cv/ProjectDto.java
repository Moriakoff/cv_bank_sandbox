package com.cvbank.application.DTO.cv;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProjectDto {

    @Past
    private LocalDate from;

    @Past
    private LocalDate to;

    @NotBlank
    private String position;

    @NotBlank
    private String company;

    @NotBlank
    private String locale;

    @NotBlank
    private String info;


}
