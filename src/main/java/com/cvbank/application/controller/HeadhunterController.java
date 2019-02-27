package com.cvbank.application.controller;

import com.cvbank.application.DTO.search.SearchCvRequest;
import com.cvbank.application.DTO.search.SearchCvResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hh")
public class HeadhunterController {

    @PostMapping("/search_cv_by_criteria")
    public List <SearchCvResponse> searchCvByCriteria(@RequestHeader(value = "Authorization") String token,
                                                      @RequestBody SearchCvRequest request){
        return null;
    }

    @PostMapping("/save_list_cv")
    public void saveListCv(@RequestHeader(value = "Authorization") String token,
                           @RequestBody List <Integer> cvs) {

    }


}
