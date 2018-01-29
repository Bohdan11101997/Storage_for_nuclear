package com.Service.Impl;

import com.Entity.BRV;
import com.Service.BrvService;
import com.repository.BrvRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class BrvServiceImpl implements BrvService {

    final  static Logger logger = Logger.getLogger(BrvServiceImpl.class);
    @Autowired
    BrvRepository brvRepository;


    @Override
    public void delete(Long id) {
brvRepository.delete(id);
    }

    @Override
    public BRV getById(Long id) {
    return brvRepository.findOne(id);
    }

    @Override
    public List<BRV> getAll() {
      return    brvRepository.findAll();
    }


    @Override
    public BRV SaveBrv(BRV brv) {
       BRV saveBrv=brvRepository.saveAndFlush(brv);

        logger.info("BRV was saved");
        return  saveBrv;

    }

    @Override
    public List<BRV> OrderbyData() {

        return brvRepository.OrderbyData();
    }

    @Override
    public List<BRV> OrderbyGroup_by_power() {
   return brvRepository.findAllByGroup_by_power();
    }


}
