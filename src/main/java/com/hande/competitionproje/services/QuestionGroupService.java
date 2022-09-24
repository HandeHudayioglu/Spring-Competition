package com.hande.competitionproje.services;

import com.hande.competitionproje.repository.QuestionGroupRepository;
import com.hande.competitionproje.repository.entity.QuestionGroup;
import com.hande.competitionproje.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class QuestionGroupService extends ServiceManager<QuestionGroup,Long> {

    private final QuestionGroupRepository questionGroupRepository;

    public QuestionGroupService(QuestionGroupRepository questionGroupRepository) {
        super(questionGroupRepository);
        this.questionGroupRepository=questionGroupRepository;
    }
}
