package com.cvbank.application.entity;

import com.cvbank.application.entity.type.CvStatus;
import lombok.*;

import javax.persistence.*;
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private User user;

    private LocalDate creationDate;

    private String position;

    private Integer salary;

    private String summary;

    @OneToMany(cascade = CascadeType.ALL)
    private List <Skill> skills;

    @OneToMany(cascade = CascadeType.ALL)
    private List <Project> projects;

    @OneToMany(cascade = CascadeType.ALL)
    private List <Education> educations;

    @OneToMany(cascade = CascadeType.ALL)
    private List <Certification> certifications;

    @OneToMany(cascade = CascadeType.ALL)
    private List <Achievement> achievements;

    @OneToMany(cascade = CascadeType.ALL)
    private List <Language> languages;

    private Integer countReview;

    @Enumerated(EnumType.STRING)
    private CvStatus cvStatus;



}
