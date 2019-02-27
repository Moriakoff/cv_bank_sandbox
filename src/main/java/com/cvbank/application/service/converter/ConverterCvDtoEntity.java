package com.cvbank.application.service.converter;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.cvbank.application.DTO.cv.AchievementsDto;
import com.cvbank.application.DTO.cv.CertificationDto;
import com.cvbank.application.DTO.cv.CvDto;
import com.cvbank.application.DTO.cv.EducationDto;
import com.cvbank.application.DTO.cv.ProjectDto;
import com.cvbank.application.entity.Achievement;
import com.cvbank.application.entity.CV;
import com.cvbank.application.entity.Certification;
import com.cvbank.application.entity.Education;
import com.cvbank.application.entity.Project;
import com.cvbank.application.entity.Skill;

public class ConverterCvDtoEntity {
	
	public static  CV convertCvDtoToEntity(CvDto cv) {
		LocalDate dateCreation = LocalDate.now();
		Integer countReview = 0;
		Boolean approwed = false;
		String position = cv.getPosition();
		Double salary = cv.getSalary();
		String summary = cv.getSummary();
		String additionInfo = cv.getAdditionInfo();
		List <String> languages = cv.getLanguages();
		List<String> links = cv.getLinks();
		List <Skill> skills = cv.getSkill().getSkillNames().stream()
				.map((x) -> Skill.builder().skill(x).build())
				.collect(Collectors.toList());
		List<Education> educations = cv.getEducations().stream()
				.map((e) -> convertEduToEntity(e))
				.collect(Collectors.toList());
		List<Achievement> achievements = cv.getAchievements().stream()
				.map((a) -> convertAchToEntity(a))
				.collect(Collectors.toList());
		List<Certification> certifications = cv.getCertifications().stream()
				.map((c) -> convertCerToEntity(c))
				.collect(Collectors.toList());
		List<Project> projects = cv.getProjects().stream()
				.map((p) -> convertProToEntity(p))
				.collect(Collectors.toList());
		
		return CV.builder().dateCreation(dateCreation).countReview(countReview)
				.additionInfo(additionInfo).position(position)
				.salary(salary).summary(summary).languages(languages)
				.links(links).skills(skills).educations(educations)
				.approwed(approwed).achievements(achievements)
				.certifications(certifications).projects(projects).build();
				
	}
	
	public static Education convertEduToEntity(EducationDto educationDto) {
		
		return Education.builder().dateFrom(educationDto.getDateFrom())
				.dateTo(educationDto.getDateTo())
				.institute(educationDto.getInstitute())
				.build();		
	}
	
	public static Achievement convertAchToEntity(AchievementsDto achievementsDto) {
		return Achievement.builder().year(achievementsDto.getYear())
				.description(achievementsDto.getDescription())
				.nomination(achievementsDto.getNomination()).build();	
	}
	
	public static Certification convertCerToEntity(CertificationDto cDto) {
		return Certification.builder().year(cDto.getYear())
				.description(cDto.getDescription()).build();
	}
	
	public static Project convertProToEntity(ProjectDto projectDto) {
		return Project.builder().company(projectDto.getCompany()).info(projectDto.getInfo())
				.from(projectDto.getFrom()).to(projectDto.getTo()).locale(projectDto.getLocale())
				.position(projectDto.getPosition()).build();
	}

}
