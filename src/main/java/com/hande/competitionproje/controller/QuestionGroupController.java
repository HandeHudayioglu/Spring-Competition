package com.hande.competitionproje.controller;

import com.hande.competitionproje.services.QuestionGroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questiongroup")
@RequiredArgsConstructor
public class QuestionGroupController {

    QuestionGroupService questionGroupService;
}
