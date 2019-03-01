package com.cvbank.application.controller;

import com.cvbank.application.DTO.cv.*;
import com.cvbank.application.DTO.search.SearchCvRequest;
import com.cvbank.application.DTO.search.SearchCvResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cv")
public class CvController {


    @PostMapping("/create_cv")
    public Integer createEmptyCv(@RequestHeader("Authorization") String token) {
        return null;
    }

    @PostMapping("/position")
    public void editPosition(@RequestHeader("Authorization") String token,
                             @RequestParam("position") String position) {

    }

    @PostMapping("/salary")
    public void editSalary(@RequestHeader("Authorization") String token,
                           @RequestParam("salary") Double salary) {

    }

    @PostMapping("/summary")
    public void editSummary(@RequestHeader("Authorization") String token,
                            @RequestParam("summary") String summary) {

    }

    @PostMapping("/skill")
    public void editSkill(@RequestHeader("Authorization") String token,
                          @RequestBody SkillDto skill) {

    }

    @PostMapping("/project")
    public void editProject(@RequestHeader("Authorization") String token,
                            @RequestBody ProjectDto project) {

    }

    @PostMapping("/certification")
    public void editCertification(@RequestHeader("Authorization") String token,
                                  @RequestBody CertificationDto certification) {

    }

    @PostMapping("/achievement")
    public void editAchivement(@RequestHeader("Authorization") String token,
                               @RequestBody AchievementDto achievement) {

    }

    @PostMapping("/language")
    public void editLanguage(@RequestHeader("Authorization") String token,
                             @RequestParam String language) {

    }


    @PostMapping("/search_cv_by_criteria")
    public List <SearchCvResponse> searchCvByCriteria(@RequestHeader(value = "Authorization") String token,
                                                      @RequestBody SearchCvRequest request){
        return null;
    }

    @PostMapping("/save_list_cv")
    public void saveListCv(@RequestHeader(value = "Authorization") String token,
                           @RequestBody List <Integer> cvs) {

    }

    @DeleteMapping("/delete")
    public void deleteCv(@RequestHeader("Authorization") String token,
                         @PathVariable(name = "id") Integer id) {

    }

    @GetMapping("/get_all")
    public List <CvDto> getAllCvByUser(@RequestHeader("Authorization") String token) {

        return null;
    }



}
