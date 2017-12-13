package com.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "RRV")
public class RRV {

    @Id
    @Column(name = "RRV_id")
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private Long RRV_id;

   @Column(name = "RRV_Character")
    private  String Character_RRV;

   @Column(name = "Storage_start_date")
    private Date Storage_start_date;

   @Column(name = "RRV_Notes")
    private String Notes_RRV;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Storage_id")
    private Storage storage_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private CategoryRRV category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "List_id")
    private Nuclide_list nuclide_list;

    public RRV()
    {

     }

    public RRV(Long Rrv_id, String character_RRV, Date storage_start_date, String notes_RRV, Storage storage_id, CategoryRRV category, Nuclide_list nuclide_list) {
        this.RRV_id=Rrv_id;
        Character_RRV = character_RRV;
        Storage_start_date = storage_start_date;
        Notes_RRV = notes_RRV;
        this.storage_id = storage_id;
        this.category = category;
        this.nuclide_list = nuclide_list;
    }

    public Long getRRV_id() {
        return RRV_id;
    }

    public void setRRV_id(Long RRV_id) {
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

    public Storage getStorage_id() {
        return storage_id;
    }

    public void setStorage_id(Storage storage_id) {
        this.storage_id = storage_id;
    }

    public CategoryRRV getCategory() {
        return category;
    }

    public void setCategory(CategoryRRV category) {
        this.category = category;
    }

    public Nuclide_list getNuclide_list() {
        return nuclide_list;
    }

    public void setNuclide_list(Nuclide_list nuclide_list) {
        this.nuclide_list = nuclide_list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RRV rrv = (RRV) o;

        if (RRV_id != null ? !RRV_id.equals(rrv.RRV_id) : rrv.RRV_id != null) return false;
        if (Character_RRV != null ? !Character_RRV.equals(rrv.Character_RRV) : rrv.Character_RRV != null) return false;
        if (Storage_start_date != null ? !Storage_start_date.equals(rrv.Storage_start_date) : rrv.Storage_start_date != null)
            return false;
        if (Notes_RRV != null ? !Notes_RRV.equals(rrv.Notes_RRV) : rrv.Notes_RRV != null) return false;
        if (storage_id != null ? !storage_id.equals(rrv.storage_id) : rrv.storage_id != null) return false;
        if (category != null ? !category.equals(rrv.category) : rrv.category != null) return false;
        return nuclide_list != null ? nuclide_list.equals(rrv.nuclide_list) : rrv.nuclide_list == null;
    }

    @Override
    public int hashCode() {
        int result = RRV_id != null ? RRV_id.hashCode() : 0;
        result = 31 * result + (Character_RRV != null ? Character_RRV.hashCode() : 0);
        result = 31 * result + (Storage_start_date != null ? Storage_start_date.hashCode() : 0);
        result = 31 * result + (Notes_RRV != null ? Notes_RRV.hashCode() : 0);
        result = 31 * result + (storage_id != null ? storage_id.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (nuclide_list != null ? nuclide_list.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RRV{" +
                "RRV_id=" + RRV_id +
                ", Character_RRV='" + Character_RRV + '\'' +
                ", Storage_start_date=" + Storage_start_date +
                ", Notes_RRV='" + Notes_RRV + '\'' +
                ", storage=" + storage_id +
                ", category=" + category +
                ", nuclide_list=" + nuclide_list +
                '}';
    }
}
