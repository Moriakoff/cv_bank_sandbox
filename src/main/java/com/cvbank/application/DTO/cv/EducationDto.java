package com.cvbank.application.DTO.cv;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EducationDto {

    @Positive
    private Integer id;

    @Positive
    private Integer dateFrom;

    @Positive
    private Integer dateTo;

    @NotBlank
    private String institute;

}
