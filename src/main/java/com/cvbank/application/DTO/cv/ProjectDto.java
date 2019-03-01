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
public class ProjectDto {

    // TODO: 2019-02-24  Think abount @Max ! Now Hard Code style

    @Positive
    private Integer id;

    @Positive
    private Integer idCv;

    private Year fromYear;

    private Year toYear;

    @NotBlank
    private String position;

    @NotBlank
    private String company;

    @NotBlank
    private String locale;

    @NotBlank
    private String info;


}
