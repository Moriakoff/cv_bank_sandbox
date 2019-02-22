package com.cvbank.application.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Education {

    @Id
    private Integer id;

    private Integer dateFrom;

    private Integer dateTo;

    private String institute;


    // TODO: 2019-02-22
    @ManyToOne
    private User user;
}
