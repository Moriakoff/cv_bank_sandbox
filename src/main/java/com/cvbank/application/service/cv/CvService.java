package com.cvbank.application.service.cv;

import java.util.List;

import com.cvbank.application.DTO.cv.CvDto;

public interface CvService {
	
	void createCv(String token, CvDto cv);
	
	void editCv(String token);
	
	void deleteCv(String token);
	
	List<?> getAllCvByUser(String token);

}
