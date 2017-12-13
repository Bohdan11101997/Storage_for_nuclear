package com.repository;

import com.Entity.TRV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TRVRepository extends JpaRepository<TRV, Long> {


    @Query(value = "SELECT t FROM TRV  t order by t.Storage_start_date desc ")
    List<TRV>  OrderbyData_StorageTRV();

    @Query(value = "select t from TRV t inner join fetch t.group_by_power g order by g.Number_of_power asc")
    List<TRV> findAllByGroup_by_powerTRV();

}
