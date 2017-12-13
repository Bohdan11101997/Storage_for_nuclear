package com.controller;

import java.sql.Date;

public class DivResource {

    private  int Div_id;
    private int storage_id;
    private  String name_device;
    private  String type_div;
    private int nuclide_list;
    private Date date_of_create_storage;
    private  Date date_of_create;
    private  String notes;


public  DivResource()
{



}


    public DivResource(int div_id, int storage_id, String name_device, String type_div, int nuclide_list, Date date_of_create_storage, Date date_of_create, String notes) {
        Div_id = div_id;
        this.storage_id = storage_id;
        this.name_device = name_device;
        this.type_div = type_div;
        this.nuclide_list = nuclide_list;
        this.date_of_create_storage = date_of_create_storage;
        this.date_of_create = date_of_create;
        this.notes = notes;
    }

    public int getDiv_id() {
        return Div_id;
    }

    public void setDiv_id(int div_id) {
        Div_id = div_id;
    }

    public int getStorage_id() {
        return storage_id;
    }

    public void setStorage_id(int storage_id) {
        this.storage_id = storage_id;
    }

    public String getName_device() {
        return name_device;
    }

    public void setName_device(String name_device) {
        this.name_device = name_device;
    }

    public String getType_div() {
        return type_div;
    }

    public void setType_div(String type_div) {
        this.type_div = type_div;
    }

    public int getNuclide_list() {
        return nuclide_list;
    }

    public void setNuclide_list(int nuclide_list) {
        this.nuclide_list = nuclide_list;
    }

    public Date getDate_of_create_storage() {
        return date_of_create_storage;
    }

    public void setDate_of_create_storage(Date date_of_create_storage) {
        this.date_of_create_storage = date_of_create_storage;
    }

    public Date getDate_of_create() {
        return date_of_create;
    }

    public void setDate_of_create(Date date_of_create) {
        this.date_of_create = date_of_create;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
