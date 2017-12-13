package com.repository;

import com.Entity.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StorageRepository extends JpaRepository<Storage, Integer> {


    @Query("SELECT  s from  Storage  s order by s.Capacity desc")
    List<Storage> OrderByCapacity();


    @Query("SELECT  s.Storage_id from  Storage  s")
    List<Storage> getStorage_id();
}
