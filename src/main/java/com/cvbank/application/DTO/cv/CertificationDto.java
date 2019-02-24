package com.cvbank.application.DTO.cv;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

public class CertificationDto {

    @Positive
    private Integer year;

    @NotBlank
    private String description;
}
