package com.cvbank.application.controller.implimentation;

import com.cvbank.application.DTO.SearchCvRequest;
import com.cvbank.application.DTO.SearchCvResponse;
import com.cvbank.application.controller.HeadHunterController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hh")
public class HeadhunterControllerImpl implements HeadHunterController {

    @PostMapping("/search_cv_by_criteria")
    public List <SearchCvResponse> searchCvByCriteria(@RequestBody SearchCvRequest request){
        return null;
    }

    @PostMapping("/save_list_cv")
    public void saveListCv(List <Integer> cvs) {

    }


}
