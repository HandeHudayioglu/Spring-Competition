package com.hande.competitionproje.controller;

import com.hande.competitionproje.services.AttendanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attendancecontroller")
@RequiredArgsConstructor
public class AttendanceController {

    final AttendanceService attendanceService;
}
