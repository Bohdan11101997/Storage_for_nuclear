package com.Service;

import com.Entity.TRV;

import java.util.List;

public interface TrvService {
    TRV SaveTRV(TRV trv);
    void delete(Long id);
    TRV getById(Long id);
    List<TRV> getAll();
    List<TRV>  OrderbyData_StorageTRV();
    List<TRV>  findAllByGroup_by_powerTRV();
}
