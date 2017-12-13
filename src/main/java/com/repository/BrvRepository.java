package com.repository;

import com.Entity.BRV;
import com.Entity.Group_by_power;
import com.Entity.Nuclide_list;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface BrvRepository extends JpaRepository<BRV, Long> {


//@Query(value = "select c1 from BRV c1 inner join fetch c1.nuclide_list b")
//List<BRV>  listBrvs ();

@Query(value = "SELECT b FROM BRV  b order by b.Storage_start_date desc  ")
    List<BRV>  OrderbyData();

    @Query(value = "select c1 from BRV c1 inner join fetch c1.group_by_power b order by b.Number_of_power asc ")
    List<BRV> findAllByGroup_by_power();


}
