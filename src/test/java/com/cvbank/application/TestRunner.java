package com.cvbank.application;

import com.fasterxml.jackson.core.JsonProcessingException;

public class TestRunner {

    public static void main(String[] args) throws JsonProcessingException {
        /*    CvDto cvDto = CvDto.builder()
         *//*  .firstName("Sasha")
                .lastName("Pupsikov")*//*
                .position("Java developer")
                .salary(2000.)
                .skill(SkillDto.builder()
                        .skillName(Stream.of("java","Mysql").collect(Collectors.toList()))
                        .build())
                .build();

*//*        CvDto cvDto = CvDto.builder()
                .position("Java developer")
                .salary(2000.)
                .skill(Stream.of(new SkillDto("Java"),
                                new SkillDto("Hibernate"))
                                .collect(Collectors.toList()))
                .build();*//*

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(cvDto);
        System.out.println(json);

        SkillDto skillDto = SkillDto.builder()
                .skillName(Stream.of("java","Mysql").collect(Collectors.toList()))
                .build();

*//*        List<SkillDto> skill = Stream.of(new SkillDto("Java"),
                new SkillDto("Hibernate"))
                .collect(Collectors.toList());

                for (SkillDto skillDto : skill) {
                    System.out.println(skillDto.getSkillName());
                }*//*

        for (String skill: skillDto.getSkillName()) {
            System.out.println(skill);
        }
*/
}}
