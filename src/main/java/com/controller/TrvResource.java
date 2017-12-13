package com.controller;

import java.sql.Date;

public class TrvResource {
    private int TRV_id;
private  String notes;
private Date Storage_start_date;
private int storage_id;
private int nuclide_list;
private String group_by_power;


    public TrvResource(int TRV_id, String notes, Date storage_start_date, int storage_id, int nuclide_list, String group_by_power) {
       this.TRV_id=TRV_id;
        this.notes = notes;
        Storage_start_date = storage_start_date;
        this.storage_id = storage_id;
        this.nuclide_list = nuclide_list;
        this.group_by_power = group_by_power;
    }

    public int getTRV_id() {
        return TRV_id;
    }

    public void setTRV_id(int TRV_id) {
        this.TRV_id = TRV_id;
    }

    private TrvResource()

    {



    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getStorage_start_date() {
        return Storage_start_date;
    }

    public void setStorage_start_date(Date storage_start_date) {
        Storage_start_date = storage_start_date;
    }

    public int getStorage_id() {
        return storage_id;
    }

    public void setStorage_id(int storage_id) {
        this.storage_id = storage_id;
    }

    public int getNuclide_list() {
        return nuclide_list;
    }

    public void setNuclide_list(int nuclide_list) {
        this.nuclide_list = nuclide_list;
    }

    public String getGroup_by_power() {
        return group_by_power;
    }

    public void setGroup_by_power(String group_by_power) {
        this.group_by_power = group_by_power;
    }
}
