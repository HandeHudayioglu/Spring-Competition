package com.hande.competitionproje.controller;

import com.hande.competitionproje.services.CompetitionQuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/competitionquestion")
@RequiredArgsConstructor
public class CompetitionQuestionController {

    final CompetitionQuestionService competitionQuestionService;
}
