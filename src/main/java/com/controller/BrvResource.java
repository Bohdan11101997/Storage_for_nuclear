package com.controller;

import java.sql.Date;

public class BrvResource {

    private  int BRV_id;
    private int storage_id;
    private String group_by_power;
    private int nuclide_list;
    private Date storage_start_date;
    private String Notes_BRV;

    public String getGroup_by_power() {
        return group_by_power;
    }

    public void setGroup_by_power(String group_by_power) {
        this.group_by_power = group_by_power;
    }

    public Date getStorage_start_date() {
        return storage_start_date;
    }

    public void setStorage_start_date(Date storage_start_date) {
        this.storage_start_date = storage_start_date;
    }

    public BrvResource() {
    }

    public BrvResource( int BRV_id, int storage_id, String group_by_power, int nuclide_list, String notes_BRV) {
this.BRV_id=BRV_id;
        this.storage_id = storage_id;
        this.group_by_power = group_by_power;
        this.nuclide_list = nuclide_list;
        Notes_BRV = notes_BRV;
    }

    public int getBRV_id() {
        return BRV_id;
    }

    public void setBRV_id(int BRV_id) {
        this.BRV_id = BRV_id;
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

    public String getNotes_BRV() {
        return Notes_BRV;
    }

    public void setNotes_BRV(String notes_BRV) {
        Notes_BRV = notes_BRV;
    }
}
