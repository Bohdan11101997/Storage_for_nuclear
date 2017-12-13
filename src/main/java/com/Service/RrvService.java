package com.Service;

import com.Entity.RRV;

import java.util.List;

public interface RrvService {
    void delete(Long id);
    RRV getById(Long id);
    List<RRV> getAll();
    RRV SaveRrv(RRV rrv);
    List<RRV> OrderbyDataRRV();
    List<RRV> findAllByCategory();
}
