package com.repository;

import com.Entity.Chemical_element;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Chemical_elementRepository extends JpaRepository<Chemical_element, Long> {
}
