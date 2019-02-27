package com.cvbank.application.service.cv;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cvbank.application.DTO.cv.CvDto;
import com.cvbank.application.entity.CV;
import com.cvbank.application.entity.User;
import com.cvbank.application.repository.CvRepository;
import com.cvbank.application.repository.UserSessionRepository;
import com.cvbank.application.service.converter.ConverterCvDtoEntity;

@Service
public class CvServiceImpl implements CvService {
	
	@Autowired
	private CvRepository cvRepository;
	
	@Autowired
	private UserSessionRepository userSession;

	@Override
	@Transactional
	public void createCv(String token, CvDto cv) {
		User user = userSession.findUserByToken(token);
		CV cvEntity = ConverterCvDtoEntity.convertCvDtoToEntity(cv);
		cvEntity.setUser(user);
		cvRepository.save(cvEntity);	
	}

	@Override
	public void editCv(String token) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCv(String token, Integer cvId) {
		cvRepository.deleteById(cvId);
	}

	@Override
	public List<?> getAllCvByUser(String token) {
		// TODO Auto-generated method stub
		return null;
	}

}
