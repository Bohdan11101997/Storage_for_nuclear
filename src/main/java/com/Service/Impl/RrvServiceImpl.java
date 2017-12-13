package com.Service.Impl;

import com.Entity.RRV;
import com.Service.RrvService;
import com.repository.RrvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RrvServiceImpl implements RrvService {

    @Autowired
    RrvRepository rrvRepository;


    @Override
    public void delete(Long id) {
    rrvRepository.delete(id);
    }

    @Override
    public RRV getById(Long id) {
        return rrvRepository.findOne(id);
    }


    @Override
    public List<RRV> getAll() {
        return rrvRepository.findAll();
    }

    @Override
    public RRV SaveRrv(RRV rrv) {
        return rrvRepository.saveAndFlush(rrv);
    }

    @Override
    public List<RRV> OrderbyDataRRV() {
        return rrvRepository.OrderbyDataRRV();
    }

    @Override
    public List<RRV> findAllByCategory() {
        return rrvRepository.findAllByCategory();
    }
}
