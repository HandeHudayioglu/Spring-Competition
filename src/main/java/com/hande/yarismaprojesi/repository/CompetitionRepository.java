package com.hande.yarismaprojesi.repository;

import com.hande.yarismaprojesi.repository.entity.Competition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetitionRepository extends JpaRepository<Competition,Long> {
}
