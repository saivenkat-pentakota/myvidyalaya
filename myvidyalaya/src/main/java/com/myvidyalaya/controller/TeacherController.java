package com.myvidyalaya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myvidyalaya.entity.Teacher;
import com.myvidyalaya.repository.TeacherRepository;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherRepository teachersRepository;

    @GetMapping
    public List<Teacher> getAllStudents() {
        return teachersRepository.findAll();
    }

    @PostMapping
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        return teachersRepository.save(teacher);
    }

}
