package com.cvbank.application.entity.type;

import lombok.Getter;

@Getter
public enum RoleType {

    JOBSEEKER(1),
    HEADHUNTER(2),
    SYSTEM(3);

    private Integer id;

    RoleType(Integer id) {
        this.id = id;
    }

    public static RoleType getRoleTypeById(Integer id){
        if(id == null){
            return null;
        }

        for (RoleType role : RoleType.values()) {
            if (role.getId().equals(id)){
                return role;
            }
        }

        return null;
    }
}