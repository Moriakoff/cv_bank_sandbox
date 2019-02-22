package com.cvbank.application.DTO.cv;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SkillDto {

    private List <String> skillName;

}
