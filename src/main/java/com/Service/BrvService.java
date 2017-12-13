package com.Service;

import com.Entity.BRV;

import java.util.List;

public interface BrvService {
    void delete(Long id);
    BRV getById(Long id);
    List<BRV> getAll();
    BRV SaveBrv(BRV brv);
List<BRV> OrderbyData();
List<BRV> OrderbyGroup_by_power();
}
