package com.cvbank.application.DTO.cv;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EducationDto {

    @Positive
    private Integer dateFrom;

    @Positive
    private Integer dateTo;

    @NotBlank
    private String institute;

}
