package com.myvidyalaya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myvidyalaya.entity.TimeTable;

public interface TimeTableRepository extends JpaRepository<TimeTable, Long> {

}
