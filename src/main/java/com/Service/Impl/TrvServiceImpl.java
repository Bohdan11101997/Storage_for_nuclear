package com.Service.Impl;

import com.Entity.TRV;
import com.Service.TrvService;
import com.repository.TRVRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TrvServiceImpl implements TrvService {


    @Autowired
    TRVRepository trvRepository;


    @Override
    public TRV SaveTRV(TRV trv) {
        TRV saveTrv=trvRepository.saveAndFlush(trv);
        return  saveTrv;
    }



    @Override
    public void delete(Long id) {
 trvRepository.delete(id);
    }

    @Override
    public TRV getById(Long id) {
        return trvRepository.findOne(id);
    }

    @Override
    public List<TRV> getAll() {
        return trvRepository.findAll();
    }

    @Override
    public List<TRV> OrderbyData_StorageTRV() {
        return trvRepository.OrderbyData_StorageTRV();
    }

    @Override
    public List<TRV> findAllByGroup_by_powerTRV() {
        return trvRepository.findAllByGroup_by_powerTRV();
    }
}
