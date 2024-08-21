package com.myvidyalaya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myvidyalaya.entity.Class;
import com.myvidyalaya.repository.ClassRepository;

@RestController
@RequestMapping("/classes")
@CrossOrigin(origins = "*")
public class ClassController {

    @Autowired
    private ClassRepository classRepository;

    @GetMapping
    public List<Class> getAllClasses() {
        return classRepository.findAll();
    }

    @PostMapping
    public Class createClass(@RequestBody Class classes) {
        return classRepository.save(classes);
    }

}
