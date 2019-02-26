package com.cvbank.application.DTO.cv;
import lombok.*;

import javax.persistence.Entity;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class SkillDto {

    private List<String> skillNames;

}
