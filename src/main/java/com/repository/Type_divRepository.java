package com.repository;

import com.Entity.Type_div;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Type_divRepository extends JpaRepository<Type_div, String> {
}
