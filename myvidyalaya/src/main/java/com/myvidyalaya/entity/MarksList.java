package com.myvidyalaya.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class MarksList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long student_id;
    private Long parent_id;
    private Long teacher_id;
    private int sub1_marks;
    private int sub2_marks;
    private int sub3_marks;
    private int sub4_marks;
    private int sub5_marks;
    private int sub6_marks;
    private int total_marks;
    private float percentage;
    private String grade;

}
