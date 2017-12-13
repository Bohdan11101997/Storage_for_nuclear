package com.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Divo")
public class Div {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DIV_id")
    private Long Div_id;

   @Column(name = "Date_of_create")
   private Date date_of_create;

    @Column(name = "Name_device")
    private String name_device;

    @Column(name = "Storage_start_date")
    private Date date_of_create_storage;

    @Column(name = "Notes")
    private String notes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Storage_id")
    private Storage storage_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Type_div")
    private Type_div type_div;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "List_id")
    private Nuclide_list nuclide_list;

    public  Div()
    {


    }

    public Div(Long div_id, Date date_of_create, String name_device, Date date_of_create_storage, String notes, Storage storage_id, Type_div type_div, Nuclide_list nuclide_list) {
        Div_id = div_id;
        this.date_of_create = date_of_create;
        this.name_device = name_device;
        this.date_of_create_storage = date_of_create_storage;
        this.notes = notes;
        this.storage_id = storage_id;
        this.type_div = type_div;
        this.nuclide_list = nuclide_list;
    }

    public Long getDiv_id() {
        return Div_id;
    }

    public void setDiv_id(Long div_id) {
        Div_id = div_id;
    }

    public Date getDate_of_create() {
        return date_of_create;
    }

    public void setDate_of_create(Date date_of_create) {
        this.date_of_create = date_of_create;
    }

    public String getName_device() {
        return name_device;
    }

    public void setName_device(String name_device) {
        this.name_device = name_device;
    }

    public Date getDate_of_create_storage() {
        return date_of_create_storage;
    }

    public void setDate_of_create_storage(Date date_of_create_storage) {
        this.date_of_create_storage = date_of_create_storage;
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

    public Type_div getType_div() {
        return type_div;
    }

    public void setType_div(Type_div type_div) {
        this.type_div = type_div;
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

        Div div = (Div) o;

        if (Div_id != null ? !Div_id.equals(div.Div_id) : div.Div_id != null) return false;
        if (date_of_create != null ? !date_of_create.equals(div.date_of_create) : div.date_of_create != null)
            return false;
        if (name_device != null ? !name_device.equals(div.name_device) : div.name_device != null) return false;
        if (date_of_create_storage != null ? !date_of_create_storage.equals(div.date_of_create_storage) : div.date_of_create_storage != null)
            return false;
        if (notes != null ? !notes.equals(div.notes) : div.notes != null) return false;
        if (storage_id != null ? !storage_id.equals(div.storage_id) : div.storage_id != null) return false;
        if (type_div != null ? !type_div.equals(div.type_div) : div.type_div != null) return false;
        return nuclide_list != null ? nuclide_list.equals(div.nuclide_list) : div.nuclide_list == null;
    }

    @Override
    public int hashCode() {
        int result = Div_id != null ? Div_id.hashCode() : 0;
        result = 31 * result + (date_of_create != null ? date_of_create.hashCode() : 0);
        result = 31 * result + (name_device != null ? name_device.hashCode() : 0);
        result = 31 * result + (date_of_create_storage != null ? date_of_create_storage.hashCode() : 0);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + (storage_id != null ? storage_id.hashCode() : 0);
        result = 31 * result + (type_div != null ? type_div.hashCode() : 0);
        result = 31 * result + (nuclide_list != null ? nuclide_list.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Div{" +
                "Div_id=" + Div_id +
                ", date_of_create=" + date_of_create +
                ", name_device='" + name_device + '\'' +
                ", date_of_create_storage=" + date_of_create_storage +
                ", notes='" + notes + '\'' +
                ", storage_id=" + storage_id +
                ", type_div=" + type_div +
                ", nuclide_list=" + nuclide_list +
                '}';
    }
}