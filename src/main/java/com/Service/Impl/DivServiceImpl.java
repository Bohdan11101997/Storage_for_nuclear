package com.Service.Impl;

import com.Entity.Div;
import com.Service.DivService;
import com.repository.DivRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivServiceImpl implements DivService {

    @Autowired
    DivRepository divRepository;

    @Override
    public Div saveDiv(Div div) {
        Div SaveDiv = divRepository.saveAndFlush(div);
        return  SaveDiv;
    }
    @Override
    public void delete(Long id) {
    divRepository.delete(id);
    }

    @Override
    public Div getById(Long id) {
        return  divRepository.findOne(id);
    }



    @Override
    public List<Div> getAll() {
        return  divRepository.findAll();
    }

    @Override
    public List<Div> OrderbyData_Storage() {
        return divRepository.OrderbyData_Storage();
    }

    @Override
    public List<Div> OrderbyData_Create() {
        return divRepository.OrderbyData_Create();
    }

}
