package com.cvbank.application.DTO.cv;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CvDto {

    @NotBlank
    private String position; //indexing

    @Positive
    private Double salary; //indexing

    @NotBlank
    private String summary;

    private SkillDto skill; //indexing                  /*Skill*/

    private List <ProjectDto> projects;                 /*Project*/

    private List <EducationDto> educations;             /*Education*/

    private List <CertificationDto> certifications;     /*Certification*/

    private List <AchievementsDto> achievements;        /*Achievement*/

    private List <String> languages; //indexing

    private List <String> links;
}
