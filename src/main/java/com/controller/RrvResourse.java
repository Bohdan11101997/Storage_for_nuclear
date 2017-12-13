package com.controller;


import java.sql.Date;

public class RrvResourse
{
private int RRV_id;
private String Character_RRV;
    private Date Storage_start_date;
    private String Notes_RRV;
    private int storage_id;
    private String category;
    private int nuclide_list;

    public RrvResourse( int RRV_id, String character_RRV, Date storage_start_date, String notes_RRV, int storage_id, String category, int nuclide_list) {
        this.RRV_id=RRV_id;
        Character_RRV = character_RRV;
        Storage_start_date = storage_start_date;
        Notes_RRV = notes_RRV;
        this.storage_id = storage_id;
        this.category = category;
        this.nuclide_list = nuclide_list;
    }
    public RrvResourse()
    {


    }

    public int getRRV_id() {
        return RRV_id;
    }

    public void setRRV_id(int RRV_id) {
        this.RRV_id = RRV_id;
    }

    public String getCharacter_RRV() {
        return Character_RRV;
    }

    public void setCharacter_RRV(String character_RRV) {
        Character_RRV = character_RRV;
    }

    public Date getStorage_start_date() {
        return Storage_start_date;
    }

    public void setStorage_start_date(Date storage_start_date) {
        Storage_start_date = storage_start_date;
    }

    public String getNotes_RRV() {
        return Notes_RRV;
    }

    public void setNotes_RRV(String notes_RRV) {
        Notes_RRV = notes_RRV;
    }

    public int getStorage_id() {
        return storage_id;
    }

    public void setStorage_id(int storage_id) {
        this.storage_id = storage_id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getNuclide_list() {
        return nuclide_list;
    }

    public void setNuclide_list(int nuclide_list) {
        this.nuclide_list = nuclide_list;
    }


}
