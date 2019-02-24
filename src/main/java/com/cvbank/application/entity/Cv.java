package com.cvbank.application.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Cv {

    // TODO: 2019-02-24 Think about relationships

    private Integer id;

    @ManyToOne
    private User user;

    private LocalDate creationDate;

    private String position;

    private Double salary;

    private String summary;

    @OneToMany
    private List <Skill> skills;

    @OneToMany
    private List <Project> projects;

    @OneToMany
    private List <Education> educations;

    @OneToMany
    private List <Certification> certifications;

    @OneToMany
    private List <Achievement> achievements;

    @OneToMany
    private List <Language> languages;


}
