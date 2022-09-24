package com.hande.competitionproje.repository;

import com.hande.competitionproje.repository.entity.Attendance;
import com.hande.competitionproje.repository.entity.QuestionGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionGroupRepository extends JpaRepository<QuestionGroup,Long> {
}
