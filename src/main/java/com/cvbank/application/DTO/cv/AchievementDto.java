package com.cvbank.application.DTO.cv;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AchievementDto {

// TODO: 2019-02-24 Hard Code Detected!!!!

    @Positive
    @Min(value = 1970)
    @Max(value = 2019)
    private Integer year;

    @Positive
    private Integer id;

    @NotBlank
    private String description;

    @NotBlank
    private String nomination;
}
