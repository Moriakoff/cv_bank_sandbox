package com.cvbank.application.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Achievement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer year;
    private String description;
    private String nomination;

    // TODO: 2019-02-22
    @ManyToOne
    private User user;
}
