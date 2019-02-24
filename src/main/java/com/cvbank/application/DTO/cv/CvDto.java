package com.cvbank.application.DTO.cv;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CvDto {
    /*User*//*            private String firstName;
    *//*User*//*            private String lastName;*/

    @NotBlank
    private String position; //indexing
    @Positive
    private Double salary; //indexing
                        /*private String info;*/
   /* *//*User*//*            private ContactInfoDto contactInfoDto; //index (city, citizenship)*/
                        @NotBlank
                        private String summary;
    /*Skill*/           private SkillDto skill; //indexing
    /*Project*/         private List <ProjectDto> projects;
    /*Education*/       private List <EducationDto> educations;
    /*Certification*/   private List <CertificationDto> certifications;
    /*Achievement*/     private List <AchievementsDto> achievements;
                        private List <String> languages; //indexing
                        private List <String> links;
}
