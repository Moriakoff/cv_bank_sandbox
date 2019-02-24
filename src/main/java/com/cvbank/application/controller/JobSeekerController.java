package com.cvbank.application.controller;

import com.cvbank.application.DTO.cv.CvDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobseeker")
public class JobSeekerController {

    @PostMapping("/")
    public void createCv(@RequestHeader("token") String token,
                         @RequestBody CvDto cv) {

    }

    @PutMapping("/")
    public void editCv(@RequestHeader("token")  String token){

    }

    @DeleteMapping("/")
    public void deleteCv(@RequestHeader("token")  String token){

    }

    @GetMapping("/")
    public List<?> getAllCvByUser(@RequestHeader("token")  String token){

        return null;
    }

    // TODO: 2019-02-23  implement remaining methods, think about response of getAll

}
