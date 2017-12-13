package com.repository;

import com.Entity.RRV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RrvRepository extends JpaRepository<RRV, Long> {

    @Query(value = "SELECT r FROM RRV  r order by r.Storage_start_date desc ")
    List<RRV> OrderbyDataRRV();

    @Query(value = "select r from RRV r inner join fetch r.category c order by c.type_category asc")
    List<RRV> findAllByCategory();
}
