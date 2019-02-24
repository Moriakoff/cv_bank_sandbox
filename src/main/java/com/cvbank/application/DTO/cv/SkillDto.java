package com.cvbank.application.DTO.cv;
import lombok.*;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class SkillDto {

    @NotBlank
    private List<String> skillName;

}
