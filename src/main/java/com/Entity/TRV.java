package com.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "TRV")
public class TRV {

    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private Long TRV_id;

    @Column(name = "Storage_start_date")
    private Date Storage_start_date;

    @Column(name = "Notes")
    private String notes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Storage_id")
    private Storage storage_id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "List_id")
    private Nuclide_list nuclide_list;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Group_by_power")
    private Group_by_power group_by_power;

    public TRV(Long TRV_id, Date storage_start_date, String notes, Storage storage_id, Nuclide_list nuclide_list, Group_by_power group_by_power) {
        this.TRV_id = TRV_id;
        Storage_start_date = storage_start_date;
        this.notes = notes;
        this.storage_id = storage_id;
        this.nuclide_list = nuclide_list;
        this.group_by_power = group_by_power;
    }

    public TRV() {


    }

    public Long getTRV_id() {
        return TRV_id;
    }

    public void setTRV_id(Long TRV_id) {
        this.TRV_id = TRV_id;
    }

    public Date getStorage_start_date() {
        return Storage_start_date;
    }

    public void setStorage_start_date(Date storage_start_date) {
        Storage_start_date = storage_start_date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Storage getStorage_id() {
        return storage_id;
    }

    public void setStorage_id(Storage storage_id) {
        this.storage_id = storage_id;
    }

    public Nuclide_list getNuclide_list() {
        return nuclide_list;
    }

    public void setNuclide_list(Nuclide_list nuclide_list) {
        this.nuclide_list = nuclide_list;
    }

    public Group_by_power getGroup_by_power() {
        return group_by_power;
    }

    public void setGroup_by_power(Group_by_power group_by_power) {
        this.group_by_power = group_by_power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TRV trv = (TRV) o;

        if (TRV_id != null ? !TRV_id.equals(trv.TRV_id) : trv.TRV_id != null) return false;
        if (Storage_start_date != null ? !Storage_start_date.equals(trv.Storage_start_date) : trv.Storage_start_date != null)
            return false;
        if (notes != null ? !notes.equals(trv.notes) : trv.notes != null) return false;
        if (storage_id != null ? !storage_id.equals(trv.storage_id) : trv.storage_id != null) return false;
        if (nuclide_list != null ? !nuclide_list.equals(trv.nuclide_list) : trv.nuclide_list != null) return false;
        return group_by_power != null ? group_by_power.equals(trv.group_by_power) : trv.group_by_power == null;
    }

    @Override
    public int hashCode() {
        int result = TRV_id != null ? TRV_id.hashCode() : 0;
        result = 31 * result + (Storage_start_date != null ? Storage_start_date.hashCode() : 0);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + (storage_id != null ? storage_id.hashCode() : 0);
        result = 31 * result + (nuclide_list != null ? nuclide_list.hashCode() : 0);
        result = 31 * result + (group_by_power != null ? group_by_power.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TRV{" +
                "TRV_id=" + TRV_id +
                ", Storage_start_date=" + Storage_start_date +
                ", notes='" + notes + '\'' +
                ", storage_id=" + storage_id +
                ", nuclide_list=" + nuclide_list +
                ", group_by_power=" + group_by_power +
                '}';
    }
}