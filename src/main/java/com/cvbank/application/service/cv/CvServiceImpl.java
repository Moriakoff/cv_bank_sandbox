package com.cvbank.application.service.cv;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.cvbank.application.DTO.cv.CvDto;
import com.cvbank.application.entity.Skill;
import com.cvbank.application.entity.User;
import com.cvbank.application.repository.UserSessionRepository;

public class CvServiceImpl implements CvService {
	
	@Autowired
	private UserSessionRepository userSession;

	@Override
	public void createCv(String token, CvDto cv) {
		// TODO Auto-generated method stub
		User user = userSession.findUserByToken(token);
		LocalDate dateCreation = LocalDate.now();
		Integer countReview = 0;
		Boolean approwed = false;
		String position = cv.getPosition();
		Double salary = cv.getSalary();
		String summary = cv.getSummary();
		String additionInfo = "";   //TODO
		List <String> languages = cv.getLanguages();
		List <Skill> skills = cv.getSkill().getSkillNames().stream()
				.map((x) -> Skill.builder().skill(x).build())
				.collect(Collectors.toList());
		
		
		
		

	}

	@Override
	public void editCv(String token) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCv(String token) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<?> getAllCvByUser(String token) {
		// TODO Auto-generated method stub
		return null;
	}

}
