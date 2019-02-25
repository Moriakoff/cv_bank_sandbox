package com.cvbank.application.entity;

import com.cvbank.application.entity.type.RoleType;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;

    private String lastName;

    private String phone;

    private LocalDate birthday;

    @Email
    private String email;

    private String city;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;


}
