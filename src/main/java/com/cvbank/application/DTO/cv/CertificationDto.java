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
public class CertificationDto {

    @Positive
    private Integer id;

    @Positive
    private Integer year;

    @NotBlank
    private String description;
}
