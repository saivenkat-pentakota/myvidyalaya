package com.myvidyalaya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myvidyalaya.entity.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

}
