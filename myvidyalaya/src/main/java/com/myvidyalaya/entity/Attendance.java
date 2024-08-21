package com.myvidyalaya.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long student_id;
    private Long faculty_id;
    private Long parent_id;
    private String academic_month;
    private int academic_year;
    private int total_days;
    private int present_days;
    private int absent_days;
}
