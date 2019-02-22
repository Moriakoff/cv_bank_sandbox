package com.cvbank.application.entity;

import com.cvbank.application.entity.type.RoleType;
import com.cvbank.application.entity.type.RoleTypeConverter;
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

    // TODO: 2019-02-22 think about userRole
    @Convert(converter = RoleTypeConverter.class)
    @ElementCollection(targetClass = RoleTypeConverter.class, fetch = FetchType.EAGER)
    private RoleType roleType;


}
