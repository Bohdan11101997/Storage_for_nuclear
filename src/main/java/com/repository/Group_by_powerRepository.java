package com.repository;

import com.Entity.Group_by_power;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Group_by_powerRepository extends JpaRepository<Group_by_power, String> {
}
