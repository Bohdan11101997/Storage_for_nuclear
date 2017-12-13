package com.repository;


import com.Entity.Nuclide_list;
import com.Entity.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Nuclide_listRepository extends JpaRepository<Nuclide_list, Integer> {


    @Query(value = "select sum(n.amount) from Nuclide_list n inner join  n.brvs b ")
    List<Double> All_Amount_BRVS();

    @Query(value = "select sum(n.activity) from Nuclide_list n inner join  n.brvs b ")
    List<Double> All_Activity_BRVS();

    @Query(value = "select sum(n.amount) from Nuclide_list n inner join  n.trvs b ")
    List<Double> All_Amount_TRVS();

    @Query(value = "select sum(n.activity) from Nuclide_list n inner join  n.trvs b ")
    List<Double> All_Activity_TRVS();

    @Query(value = "select sum(n.amount) from Nuclide_list n inner join  n.divs b ")
    List<Double> All_Amount_DIVS();

    @Query(value = "select sum(n.activity) from Nuclide_list n inner join  n.divs b ")
    List<Double> All_Activity_DIVS();

    @Query(value = "select sum(n.amount) from Nuclide_list n inner join  n.rrvs b ")
    List<Double> All_Amount_RRVS();

    @Query(value = "select sum(n.activity) from Nuclide_list n inner join  n.rrvs b ")
    List<Double> All_Activity_RRVS();

    @Query(value = "select sum(n.activity) from Nuclide_list n inner join  n.rrvs b  inner join b.storage_id where b.storage_id=:storage_id")
    Double All_Activity_Storage_RRV(@Param("storage_id") Storage storage_id);

    @Query(value = "select sum(n.activity) from Nuclide_list n inner join  n.brvs b  inner join b.storage_id where b.storage_id=:storage_id")
    Double All_Activity_Storage_BRV(@Param("storage_id") Storage storage_id);

    @Query(value = "select sum(n.activity) from Nuclide_list n inner join  n.trvs b  inner join b.storage_id where b.storage_id=:storage_id")
    Double All_Activity_Storage_TRV(@Param("storage_id") Storage storage_id);

    @Query(value = "select sum(n.activity) from Nuclide_list n inner join  n.divs b  inner join b.storage_id where b.storage_id=:storage_id")
    Double All_Activity_Storage_DIV(@Param("storage_id") Storage storage_id);
//
    @Query(value = "select sum(n.amount) from Nuclide_list n inner join  n.rrvs b  inner join b.storage_id where b.storage_id=:storage_id")
    Double All_Amount_Storage_RRV(@Param("storage_id") Storage storage_id);

    @Query(value = "select sum(n.amount) from Nuclide_list n inner join  n.brvs b  inner join b.storage_id where b.storage_id=:storage_id")
    Double All_Amount_Storage_BRV(@Param("storage_id") Storage storage_id);

    @Query(value = "select sum(n.amount) from Nuclide_list n inner join  n.trvs b  inner join b.storage_id where b.storage_id=:storage_id")
    Double All_Amount_Storage_TRV(@Param("storage_id") Storage storage_id);

    @Query(value = "select sum(n.amount) from Nuclide_list n inner join  n.divs b  inner join b.storage_id where b.storage_id=:storage_id")
    Double All_Amount_Storage_DIV(@Param("storage_id") Storage storage_id);
}
