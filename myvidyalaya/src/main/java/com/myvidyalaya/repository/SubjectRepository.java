package com.myvidyalaya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myvidyalaya.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
