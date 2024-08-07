package com.myvidyalaya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myvidyalaya.entity.School;

public interface SchoolRepository extends JpaRepository<School, Long> {

}
