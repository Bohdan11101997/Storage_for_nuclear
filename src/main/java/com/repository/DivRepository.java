package com.repository;

import com.Entity.Div;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DivRepository extends JpaRepository<Div, Long> {

    @Query(value = "SELECT d FROM Div  d order by d.date_of_create_storage desc ")
    List<Div>  OrderbyData_Storage();

    @Query(value = "select d from Div d  order by d.date_of_create desc")
    List<Div> OrderbyData_Create();



}
