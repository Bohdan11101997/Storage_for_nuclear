package com.Service.Impl;

import com.Entity.Type_div;
import com.Service.Type_divService;
import com.repository.Type_divRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Type_divServiceImpl implements Type_divService {

    @Autowired
    Type_divRepository type_divRepository;

    @Override
    public Type_div getById(String id) {
        return type_divRepository.findOne(id);
    }
}
