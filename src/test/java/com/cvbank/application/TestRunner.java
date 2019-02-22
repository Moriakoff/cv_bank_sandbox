package com.cvbank.application;

import com.cvbank.application.DTO.cv.CvDto;
import com.cvbank.application.DTO.cv.SkillDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestRunner {

    public static void main(String[] args) throws JsonProcessingException {
        CvDto cvDto = CvDto.builder()
              /*  .firstName("Sasha")
                .lastName("Pupsikov")*/
                .position("Java developer")
                .salary(2000.)
                .skill(SkillDto.builder()
                        .skillName(Stream.of("java","Mysql").collect(Collectors.toList()))
                        .build())
                .build();

/*        CvDto cvDto = CvDto.builder()
                .position("Java developer")
                .salary(2000.)
                .skill(Stream.of(new SkillDto("Java"),
                                new SkillDto("Hibernate"))
                                .collect(Collectors.toList()))
                .build();*/

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(cvDto);
        System.out.println(json);

        SkillDto skillDto = SkillDto.builder()
                .skillName(Stream.of("java","Mysql").collect(Collectors.toList()))
                .build();

/*        List<SkillDto> skill = Stream.of(new SkillDto("Java"),
                new SkillDto("Hibernate"))
                .collect(Collectors.toList());

                for (SkillDto skillDto : skill) {
                    System.out.println(skillDto.getSkillName());
                }*/

        for (String skill: skillDto.getSkillName()) {
            System.out.println(skill);
        }

}}
