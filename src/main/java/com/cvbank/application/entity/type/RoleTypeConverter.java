package com.cvbank.application.entity.type;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class RoleTypeConverter implements AttributeConverter<RoleType,Integer> {


    @Override
    public Integer convertToDatabaseColumn(RoleType attribute) {
        return attribute == null ? null : attribute.getId();
    }

    @Override
    public RoleType convertToEntityAttribute(Integer dbData) {
        return RoleType.getRoleTypeById(dbData);
    }
}
