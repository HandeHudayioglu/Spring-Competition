package com.hande.competitionproje.services;

import com.hande.competitionproje.repository.CompetitionRepository;
import com.hande.competitionproje.repository.entity.Competition;
import com.hande.competitionproje.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class CompetitionService extends ServiceManager<Competition,Long> {

    private final CompetitionRepository competitionRepository;


    public CompetitionService(CompetitionRepository competitionRepository) {
        super(competitionRepository);
        this.competitionRepository=competitionRepository;
    }
}
