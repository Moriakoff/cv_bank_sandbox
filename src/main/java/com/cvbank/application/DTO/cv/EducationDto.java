package com.cvbank.application.DTO.cv;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EducationDto {

    private Integer dateFrom;
    private Integer dateTo;
    private String institute;

}
