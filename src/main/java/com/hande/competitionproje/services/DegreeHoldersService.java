package com.hande.competitionproje.services;

import com.hande.competitionproje.repository.DegreeHoldersRepository;
import com.hande.competitionproje.repository.entity.DegreeHolders;
import com.hande.competitionproje.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class DegreeHoldersService extends ServiceManager<DegreeHolders,Long> {

    private final DegreeHoldersRepository degreeHoldersRepository;

    public DegreeHoldersService(DegreeHoldersRepository degreeHoldersRepository) {
        super(degreeHoldersRepository);
        this.degreeHoldersRepository=degreeHoldersRepository;
    }
}
