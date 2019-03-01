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
public class EducationDto {

    @Positive
    private Integer id;

    @Positive
    private Integer idCv;

    private Year dateFrom;

    private Year dateTo;

    @NotBlank
    private String institute;

}
