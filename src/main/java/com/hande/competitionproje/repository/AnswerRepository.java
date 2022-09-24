package com.hande.competitionproje.repository;

import com.hande.competitionproje.repository.entity.Answer;
import com.hande.competitionproje.repository.entity.Competition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<Answer,Long> {
}
