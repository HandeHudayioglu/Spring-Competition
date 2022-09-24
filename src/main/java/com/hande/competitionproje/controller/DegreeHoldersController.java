package com.hande.competitionproje.controller;

import com.hande.competitionproje.services.DegreeHoldersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/degreeholders")
@RequiredArgsConstructor
public class DegreeHoldersController {

    final DegreeHoldersService degreeHoldersService;
}
