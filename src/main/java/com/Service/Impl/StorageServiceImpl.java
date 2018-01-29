package com.Service.Impl;

import com.Entity.Storage;
import com.Service.StorageService;
import com.repository.StorageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    StorageRepository storageRepository;

    @Override
    public void delete(Integer id) {
        storageRepository.delete(id);
    }

    @Override
    public Storage getById(Integer id) {
        return storageRepository.findOne(id);
    }

    @Override
    public List<Storage> getAll() {
        return storageRepository.findAll();
    }


    @Override
    public Storage SaveStorage(Storage storage) {
        return storageRepository.saveAndFlush(storage);
    }

    @Override
    public List<Storage> OrderByCapacity() {
        return storageRepository.OrderByCapacity();
    }

    @Override
    public List<Storage> getStorage_id() {
        return storageRepository.getStorage_id();
    }

    @Override
    public Double All_Amount_Storage_BRV(Integer storage_id) {
        return storageRepository.All_Amount_Storage_BRV(storage_id);
    }

    @Override
    public List<Storage> FindStorageByName(String name) {
        return storageRepository.findByName(name);
    }

}
