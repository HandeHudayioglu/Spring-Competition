package com.hande.competitionproje.services;

import com.hande.competitionproje.repository.CompetitionQuestionRepository;
import com.hande.competitionproje.repository.entity.CompetitionQuestion;
import com.hande.competitionproje.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class CompetitionQuestionService extends ServiceManager<CompetitionQuestion,Long> {

    private final CompetitionQuestionRepository competitionQuestionRepository;


    public CompetitionQuestionService(CompetitionQuestionRepository competitionQuestionRepository) {
        super(competitionQuestionRepository);
        this.competitionQuestionRepository=competitionQuestionRepository;
    }
}
