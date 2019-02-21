package com.cvbank.application.DTO.cv;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CvDto {
    /*User*/            private String firstName;
    /*User*/            private String lastName;
    private String position; //indexing
    private Double salary; //indexing
    private String info;
    /*User*/            private ContactInfoDto contactInfoDto; //index (city, citizenship)
    private String summary;
    /*Skill*/           private SkillDto skill; //indexing
    /*Project*/         private List <ProjectDto> projects;
    /*Education*/       private List <EducationDto> educations;
    /*Certification*/   private List <CertificationDto> certifications;
    /*Achievement*/     private List <AchievementsDto> achievements;
    private List <String> languages; //indexing
    private List <String> links;
}
