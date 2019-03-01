package com.cvbank.application.controller;

import com.cvbank.application.DTO.cv.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobseeker")
public class JobSeekerController {

    @PostMapping("/edit/create_cv")
    public Integer createEmptyCv(@RequestHeader("Authorization") String token) {
        return null;
    }

    @PostMapping("/edit/position")
    public void editPosition(@RequestHeader("Authorization") String token,
                             @RequestParam("position") String position) {

    }

    @PostMapping("/edit/salary")
    public void editSalary(@RequestHeader("Authorization") String token,
                           @RequestParam("salary") Double salary) {

    }

    @PostMapping("/edit/summary")
    public void editSummary(@RequestHeader("Authorization") String token,
                            @RequestParam("summary") String summary) {

    }

    @PostMapping("/edit//skill")
    public void editSkill(@RequestHeader("Authorization") String token,
                          @RequestBody SkillDto skill) {

    }

    @PostMapping("/edit//project")
    public void editProject(@RequestHeader("Authorization") String token,
                            @RequestBody ProjectDto project) {

    }

    @PostMapping("/edit//certification")
    public void editCertification(@RequestHeader("Authorization") String token,
                                  @RequestBody CertificationDto certification) {

    }

    @PostMapping("/edit//achievement")
    public void editAchivement(@RequestHeader("Authorization") String token,
                               @RequestBody AchievementDto achievement) {

    }

    @PostMapping("/edit//language")
    public void editLanguage(@RequestHeader("Authorization") String token,
                             @RequestParam String language) {

    }




    @DeleteMapping("/delete")
    public void deleteCv(@RequestHeader("Authorization") String token,
                         @PathVariable(name = "id") Integer id) {

    }

    @GetMapping("/get_all")
    public List <СvResponse> getAllCvByUser(@RequestHeader("Authorization") String token) {
        return null;
    }

}
