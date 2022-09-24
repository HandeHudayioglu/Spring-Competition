package com.hande.competitionproje.services;

import com.hande.competitionproje.repository.AttendanceRepository;
import com.hande.competitionproje.repository.entity.Attendance;
import com.hande.competitionproje.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class AttendanceService extends ServiceManager<Attendance,Long> {

    private final AttendanceRepository attendanceRepository;


    public AttendanceService(AttendanceRepository attendanceRepository) {
        super(attendanceRepository);
        this.attendanceRepository=attendanceRepository;
    }
}
