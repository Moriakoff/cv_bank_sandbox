package com.cvbank.application.DTO.cv;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AchievementsDto {
    private Integer year;
    private String description;
    private String nonination;
}
