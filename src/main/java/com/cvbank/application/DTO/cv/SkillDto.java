package com.cvbank.application.DTO.cv;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SkillDto {

    private List <String> programmingLanguages;
    private List <String> technologies;
    private List <String> environments;
    private List <String> databases;
    private List <String> systems;

}
