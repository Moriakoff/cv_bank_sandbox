package com.cvbank.application.controller;

import com.cvbank.application.DTO.cv.CvDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobseeker")
public class JobSeekerController {

    @PostMapping("/")
    public void createCv(@RequestHeader("Authorization") String token,
                         @RequestBody CvDto cv) {

    }

    @PutMapping("/")
    public void editCv(@RequestHeader("Authorization") String token) {

    }

    @DeleteMapping("/")
    public void deleteCv(@RequestHeader("Authorization") String token) {

    }

    @GetMapping("/")
    public List <?> getAllCvByUser(@RequestHeader("Authorization") String token) {

        return null;
    }

    // TODO: 2019-02-23  implement remaining methods, think about response of getAll

}
