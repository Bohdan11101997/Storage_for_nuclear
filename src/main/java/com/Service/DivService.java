package com.Service;

import com.Entity.Div;


import java.util.List;

public interface DivService {
    Div saveDiv(Div div);
    void delete(Long id);
    Div getById(Long id);
    List<Div> getAll();
List<Div> OrderbyData_Storage();
List<Div>  OrderbyData_Create();
}
