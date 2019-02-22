package com.cvbank.application.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate from;
    private LocalDate to;
    private String position;
    private String company;
    private String locale;
    private String info;


    // TODO: 2019-02-22
    @OneToOne
    private User user;
}
