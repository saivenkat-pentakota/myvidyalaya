package com.myvidyalaya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myvidyalaya.entity.TimeTable;
import com.myvidyalaya.repository.TimeTableRepository;

@RestController
@RequestMapping("/timetable")
@CrossOrigin(origins = "*")
public class TimeTableController {

    @Autowired
    private TimeTableRepository timeTableRepository;

    @GetMapping
    public List<TimeTable> getAllTimeTables() {
        return timeTableRepository.findAll();
    }

    @PostMapping
    public TimeTable createTimeTable(@RequestBody TimeTable timetable) {
        return timeTableRepository.save(timetable);
    }

}
