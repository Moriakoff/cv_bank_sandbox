package com.cvbank.application.DTO.cv;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDto {

    // TODO: 2019-02-24  Think abount @Max ! Now Hard Code style

    @Min(value = 1970)
    @Max(value = 2019)
    private Integer fromYear;

    @Min(value = 1970)
    @Max(value = 2019)
    private Integer toYear;

    @NotBlank
    private String position;

    @NotBlank
    private String company;

    @NotBlank
    private String locale;

    @NotBlank
    private String info;


}
