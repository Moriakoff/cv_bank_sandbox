package com.cvbank.application.controller;

import com.cvbank.application.DTO.cv.AchievementDto;
import com.cvbank.application.DTO.cv.CertificationDto;
import com.cvbank.application.DTO.cv.ProjectDto;
import com.cvbank.application.DTO.cv.SkillDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cv")
public class CvController {


    @GetMapping("/create_cv")
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

}
