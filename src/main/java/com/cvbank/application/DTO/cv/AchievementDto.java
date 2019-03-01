package com.cvbank.application.DTO.cv;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.time.Year;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AchievementDto {

    private Year year;

    @Positive
    private Integer idCv;

    @Positive
    private Integer id;

    @NotBlank
    private String description;

    @NotBlank
    private String nomination;
}
