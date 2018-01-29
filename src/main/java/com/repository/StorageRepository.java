package com.repository;

import com.Entity.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StorageRepository extends JpaRepository<Storage, Integer> {


    @Query("SELECT  s from  Storage  s order by s.Capacity desc")
    List<Storage> OrderByCapacity();


    @Query("SELECT  s.Storage_id from  Storage  s")
    List<Storage> getStorage_id();

    @Query(value = "select sum(n.amount) from Nuclide_list n inner join  n.brvs b  inner join b.storage_id where b.storage_id=:storage_id")
    Double All_Amount_Storage_BRV(@Param("storage_id") Integer storage_id);

    List<Storage> findByName(String name);
}
