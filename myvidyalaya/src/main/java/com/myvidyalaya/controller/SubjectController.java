package com.myvidyalaya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myvidyalaya.entity.Subject;
import com.myvidyalaya.repository.SubjectRepository;

@RestController
@RequestMapping("/subjects")
@CrossOrigin(origins = "*")
public class SubjectController {

    @Autowired
    private SubjectRepository subjectRepository;

    @GetMapping
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    @PostMapping
    public Subject creaSubject(@RequestBody Subject subject) {
        return subjectRepository.save(subject);
    }
}
