package com.myvidyalaya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myvidyalaya.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
