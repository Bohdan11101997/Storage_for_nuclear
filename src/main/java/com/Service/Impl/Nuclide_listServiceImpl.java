package com.Service.Impl;

import com.Entity.Nuclide_list;
import com.Entity.Storage;
import com.Service.Nuclide_listService;
import com.repository.Nuclide_listRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Nuclide_listServiceImpl implements Nuclide_listService {

    @Autowired
    Nuclide_listRepository nuclide_listRepository;

    @Override
    public Nuclide_list getByID(int id) {
        return nuclide_listRepository.findOne(id);
    }

    @Override
    public Nuclide_list SaveNuclide_list(Nuclide_list nuclide_list) {
        return null;
    }

    @Override
    public void delete(Integer id) {
nuclide_listRepository.delete(id);
    }



    @Override
    public List<Nuclide_list> getAll() {
        return nuclide_listRepository.findAll();
    }


    @Override
    public List<Double> All_Amount_BRVS() {
        return nuclide_listRepository.All_Amount_BRVS();
    }

    @Override
    public List<Double> All_Activity_BRVS() {
        return nuclide_listRepository.All_Activity_BRVS();
    }

    @Override
    public List<Double> All_Amount_TRVS() {
        return nuclide_listRepository.All_Amount_TRVS();
    }

    @Override
    public List<Double> All_Activity_TRVS() {
        return nuclide_listRepository.All_Activity_TRVS();
    }

    @Override
    public List<Double> All_Amount_DIVS() {
        return nuclide_listRepository.All_Amount_DIVS();
    }

    @Override
    public List<Double> All_Activity_DIVS() {
        return nuclide_listRepository.All_Activity_DIVS();
    }

    @Override
    public List<Double> All_Amount_RRVS() {
        return nuclide_listRepository.All_Amount_RRVS();
    }

    @Override
    public List<Double> All_Activity_RRVS() {
        return nuclide_listRepository.All_Activity_RRVS();
    }

    @Override
    public Double All_Activity_Storage_RRV(Storage storage_id) {
        return nuclide_listRepository.All_Activity_Storage_RRV(storage_id);
    }

    @Override
    public Double All_Activity_Storage_TRV(Storage storage_id) {
        return nuclide_listRepository.All_Activity_Storage_TRV(storage_id);
    }

    @Override
    public Double All_Activity_Storage_BRV(Storage storage_id) {
        return nuclide_listRepository.All_Activity_Storage_BRV(storage_id);
    }

    @Override
    public Double All_Activity_Storage_DIV(Storage storage_id) {
        return nuclide_listRepository.All_Activity_Storage_DIV(storage_id);
    }

    @Override
    public Double All_Amount_Storage_RRV(Storage storage_id) {
        return nuclide_listRepository.All_Amount_Storage_RRV(storage_id);
    }

    @Override
    public Double All_Amount_Storage_BRV(Storage storage_id) {
        return nuclide_listRepository.All_Amount_Storage_BRV(storage_id);
    }

    @Override
    public Double All_Amount_Storage_TRV(Storage storage_id) {
        return nuclide_listRepository.All_Amount_Storage_TRV(storage_id);
    }

    @Override
    public Double All_Amount_Storage_DIV(Storage storage_id) {
        return nuclide_listRepository.All_Amount_Storage_DIV(storage_id);
    }

}



