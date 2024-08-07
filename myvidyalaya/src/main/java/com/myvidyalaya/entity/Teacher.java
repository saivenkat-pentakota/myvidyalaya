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
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String teacher_firstName;
    private String teacher_lastName;
    private String subject;
    private String dob;
    private String email;
    private String phonenumber;
    private String address;
}
