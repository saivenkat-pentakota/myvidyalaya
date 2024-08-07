package com.myvidyalaya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myvidyalaya.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
