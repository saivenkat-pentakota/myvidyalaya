package com.myvidyalaya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myvidyalaya.entity.School;
import com.myvidyalaya.repository.SchoolRepository;

@RestController
@RequestMapping("/schools")
public class SchoolController {

    @Autowired
    private SchoolRepository schoolRepository;

    @GetMapping
    public List<School> getAllSchools() {
        return schoolRepository.findAll();
    }

    @PostMapping
    public School createSchool(@RequestBody School school) {
        return schoolRepository.save(school);
    }

}
