package com.cvbank.application.DTO.cv;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AchievementsDto {

    @Positive
    private Integer year;

    @NotBlank
    private String description;

    @NotBlank
    private String nomination;
}
