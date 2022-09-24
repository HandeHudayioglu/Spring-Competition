package com.hande.competitionproje.repository;

import com.hande.competitionproje.repository.entity.Answer;
import com.hande.competitionproje.repository.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance,Long> {
}
