package com.hande.competitionproje.repository;

import com.hande.competitionproje.repository.entity.Attendance;
import com.hande.competitionproje.repository.entity.DegreeHolders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DegreeHoldersRepository extends JpaRepository<DegreeHolders,Long> {
}
