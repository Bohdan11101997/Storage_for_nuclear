package com.Service.Impl;

import com.Entity.BRV;
import com.Service.BrvService;
import com.repository.BrvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class BrvServiceImpl implements BrvService {
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
        return  saveBrv;
    }

    @Override
    public List<BRV> OrderbyData() {

        return brvRepository.OrderbyData();
    }

    @Override
    public List<BRV> OrderbyGroup_by_power() {
//        Map<Integer, BRV> group = new TreeMap<>();
//        group.put(1, brvRepository.findAllByGroup_by_power().get(0));
//        group.put(2, brvRepository.findAllByGroup_by_power().get(1));
//        group.put(3, brvRepository.findAllByGroup_by_power().get(2));
//        group.entrySet().stream()
//                .sorted(Map.Entry.<Integer, BRV.>comparingByKey().reversed())
//                .forEach(System.out::println);
//
//        List<BRV> listGroup= new ArrayList(group.values());
//
//       return  listGroup;
   return brvRepository.findAllByGroup_by_power();
    }


}
