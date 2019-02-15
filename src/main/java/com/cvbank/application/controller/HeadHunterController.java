package com.cvbank.application.controller;

import com.cvbank.application.DTO.SearchCvRequest;
import com.cvbank.application.DTO.SearchCvResponse;

import java.util.List;

public interface HeadHunterController {
    List <SearchCvResponse> searchCvByCriteria(SearchCvRequest request);

    void saveListCv(List <Integer> cvs);

}
