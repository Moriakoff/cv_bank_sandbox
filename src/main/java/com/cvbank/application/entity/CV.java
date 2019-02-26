package com.cvbank.application.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity


public class CV {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Integer countReview;   //TODO
	
	private LocalDate dateCreation;
	
	private Boolean approwed;
	
	private String position;
	
    private Double salary;
    
    private String summary;
    
    private List <Skill> skills; 
    
    private List <Education> educations;
    
    private List <Certification> certifications;
    
    private List <Achievement> achievements;
    
    private List <String> languages; 
    
    private List <String> links;
    
    private String additionInfo;
    
    @ManyToOne
    private User user;
}
	
	
	


