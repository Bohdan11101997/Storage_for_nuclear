package com.Service;

import com.Entity.Storage;

import java.util.List;

public interface StorageService {

    void delete(Integer id);
    Storage getById(Integer id);
    List<Storage> getAll();
    Storage SaveStorage(Storage storage);
    List<Storage> OrderByCapacity();
   List<Storage> getStorage_id();
   Double All_Amount_Storage_BRV(Integer storage_id);
}
