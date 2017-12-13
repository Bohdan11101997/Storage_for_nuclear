package com.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "BRV")
public class BRV  {

    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BRV_id")
    private Long BRV_id;

    @Column(name = "Storage_start_date")
    private Date Storage_start_date;

    @Column(name = "Notes_BRV")
    private String Notes_BRV;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nuclide_list_id")
    private Nuclide_list  nuclide_list;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Group_by_power")
    private Group_by_power group_by_power;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Storage")
    private Storage storage_id;


    public BRV( Long BRV_id, Date storage_start_date, String notes_BRV, Nuclide_list nuclide_list, Group_by_power group_by_power, Storage storage_id) {
       this.BRV_id= BRV_id;
        Storage_start_date=storage_start_date;
        Notes_BRV = notes_BRV;
        this.nuclide_list = nuclide_list;
        this.group_by_power = group_by_power;
        this.storage_id = storage_id;
    }
public BRV()
{

}

    public Long getBRV_id() {

        return BRV_id;
    }

    public void setBRV_id(Long BRV_id) {
        this.BRV_id = BRV_id;
    }

    public Date getStorage_start_date() {
        return Storage_start_date;
    }

    public void setStorage_start_date(Date storage_start_date) {
        Storage_start_date = storage_start_date;
    }

    public String getNotes_BRV() {
        return Notes_BRV;
    }

    public void setNotes_BRV(String notes_BRV) {
        Notes_BRV = notes_BRV;
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

    public Storage getStorage_id() {
        return storage_id;
    }

    public void setStorage_id(Storage storage_id) {
        this.storage_id = storage_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BRV brv = (BRV) o;

        if (BRV_id != null ? !BRV_id.equals(brv.BRV_id) : brv.BRV_id != null) return false;
        if (Storage_start_date != null ? !Storage_start_date.equals(brv.Storage_start_date) : brv.Storage_start_date != null)
            return false;
        if (Notes_BRV != null ? !Notes_BRV.equals(brv.Notes_BRV) : brv.Notes_BRV != null) return false;
        if (nuclide_list != null ? !nuclide_list.equals(brv.nuclide_list) : brv.nuclide_list != null) return false;
        if (group_by_power != null ? !group_by_power.equals(brv.group_by_power) : brv.group_by_power != null)
            return false;
        return storage_id != null ? storage_id.equals(brv.storage_id) : brv.storage_id == null;
    }

    @Override
    public int hashCode() {
        int result = BRV_id != null ? BRV_id.hashCode() : 0;
        result = 31 * result + (Storage_start_date != null ? Storage_start_date.hashCode() : 0);
        result = 31 * result + (Notes_BRV != null ? Notes_BRV.hashCode() : 0);
        result = 31 * result + (nuclide_list != null ? nuclide_list.hashCode() : 0);
        result = 31 * result + (group_by_power != null ? group_by_power.hashCode() : 0);
        result = 31 * result + (storage_id != null ? storage_id.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BRV{" +
                "BRV_id=" + BRV_id +
                ", Storage_start_date=" + Storage_start_date +
                ", Notes_BRV='" + Notes_BRV + '\'' +
                ", nuclide_list=" + nuclide_list +
                ", group_by_power=" + group_by_power +
                ", storage_id=" + storage_id +
                '}';
    }
}
