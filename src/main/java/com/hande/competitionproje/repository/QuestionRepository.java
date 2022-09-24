package com.hande.competitionproje.repository;

import com.hande.competitionproje.repository.entity.Competition;
import com.hande.competitionproje.repository.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Long> {
}
