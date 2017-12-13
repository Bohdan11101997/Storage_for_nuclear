package com.Service;

import com.Entity.Group_by_power;
import com.Entity.Nuclide_list;
import com.Entity.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by User on 05.07.2017.
 */

@Service
public class Storages {
    public final Nuclide_listService nuclide_listService;
    public final StorageService storageService;


    @Autowired
    public Storages(Nuclide_listService nuclide_listService, StorageService storageService) {
        this.nuclide_listService = nuclide_listService;
        this.storageService = storageService;
    }
}
