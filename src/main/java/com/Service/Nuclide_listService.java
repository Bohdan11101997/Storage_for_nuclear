package com.Service;

import com.Entity.Nuclide_list;
import com.Entity.Storage;

import java.util.List;

public interface Nuclide_listService {

    Nuclide_list getByID(int id);
    Nuclide_list SaveNuclide_list(Nuclide_list nuclide_list);
    void delete(Integer id);
    List<Nuclide_list> getAll();


    List<Double>  All_Amount_BRVS();
    List<Double> All_Activity_BRVS();

    List<Double>  All_Amount_TRVS();
    List<Double> All_Activity_TRVS();

    List<Double>  All_Amount_DIVS();
    List<Double> All_Activity_DIVS();

    List<Double>  All_Amount_RRVS();
    List<Double> All_Activity_RRVS();

    Double All_Activity_Storage_RRV(Storage storage_id);
    Double All_Activity_Storage_TRV(Storage storage_id);
    Double All_Activity_Storage_BRV(Storage storage_id);
    Double All_Activity_Storage_DIV(Storage storage_id);
    Double All_Amount_Storage_RRV( Storage storage_id);
    Double All_Amount_Storage_BRV( Storage storage_id);
    Double All_Amount_Storage_TRV( Storage storage_id);
    Double All_Amount_Storage_DIV( Storage storage_id);


 }
