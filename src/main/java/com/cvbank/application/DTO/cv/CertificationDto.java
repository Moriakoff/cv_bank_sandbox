package com.cvbank.application.DTO.cv;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CertificationDto {
    private Integer year;
    private String description;
}
