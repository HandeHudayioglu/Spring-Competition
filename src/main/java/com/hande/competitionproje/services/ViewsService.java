package com.hande.competitionproje.services;

import com.hande.competitionproje.repository.ViewsRepository;
import com.hande.competitionproje.repository.entity.Views;
import com.hande.competitionproje.utility.ServiceManager;

public class ViewsService extends ServiceManager<Views,Long> {

    private final ViewsRepository viewsRepository;

    public ViewsService(ViewsRepository viewsRepository) {
        super(viewsRepository);
        this.viewsRepository=viewsRepository;

    }
}
