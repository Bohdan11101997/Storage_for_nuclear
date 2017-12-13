package com.Service.Impl;

import com.Entity.Group_by_power;
import com.Service.Group_By_powerService;
import com.repository.Group_by_powerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Group_by_powerImpl implements Group_By_powerService {

    @Autowired
    Group_by_powerRepository group_by_powerRepository;

    @Override
    public Group_by_power getByID(String id) {
        return group_by_powerRepository.findOne(id);
    }
}
