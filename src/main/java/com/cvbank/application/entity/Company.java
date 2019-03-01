package com.cvbank.application.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String link;

    @Column
    private Integer postcode;

    @Column
    public String phone;

    @Column
    public String country;

    @Column
    public String city;

    @Column
    public String address;

    @OneToMany
    public List <User> users;
}
