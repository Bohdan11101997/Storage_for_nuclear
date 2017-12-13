package com.repository;

import com.Entity.Element_list;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface Element_listRepository extends JpaRepository<Element_list, Long> {
}
