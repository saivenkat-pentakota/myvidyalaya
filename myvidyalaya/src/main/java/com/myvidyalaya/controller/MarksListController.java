package com.myvidyalaya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myvidyalaya.entity.MarksList;
import com.myvidyalaya.repository.MarksListRepository;

@RestController
@RequestMapping("/markslist")
public class MarksListController {

    @Autowired
    private MarksListRepository marksListRepository;

    @GetMapping
    public List<MarksList> getAllMarksList() {
        return marksListRepository.findAll();
    }

    @PostMapping
    public MarksList createMarksList(@RequestBody MarksList markslist) {
        return marksListRepository.save(markslist);
    }

}
