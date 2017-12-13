package com.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Storage")
public class Storage {

    @Id
    @Column(name = "Storage_id")
   private int Storage_id;

    @Column(name = "Name")
  private   String name;

    @Column(name = "Capacity")
   private int Capacity;

    @OneToMany(
            mappedBy = "storage_id",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )   private List<Div> divs = new ArrayList<>();


    @OneToMany(
            mappedBy = "storage_id",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )   private List<TRV> trvs = new ArrayList<>();

  //  @ManyToOne(fetch = FetchType.LAZY)
     @Column(name = "waste")
    private String type_waste;

    @OneToMany(
            mappedBy = "storage_id",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )   private List<RRV> rrvs = new ArrayList<>();

    @OneToMany(
            mappedBy = "storage_id",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )   private List<BRV> brvs = new ArrayList<>();



    public Storage()
    {
    }

    public Storage(int storage_id, String name, int capacity, String type_waste) {
        Storage_id = storage_id;
        this.name = name;
        Capacity = capacity;
        this.type_waste = type_waste;
    }

    public int getStorage_id() {
        return Storage_id;
    }

    public void setStorage_id(int storage_id) {
        Storage_id = storage_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public List<Div> getDivs() {
        return divs;
    }

    public void setDivs(List<Div> divs) {
        this.divs = divs;
    }

    public List<TRV> getTrvs() {
        return trvs;
    }

    public void setTrvs(List<TRV> trvs) {
        this.trvs = trvs;
    }

    public String getType_waste() {
        return type_waste;
    }

    public void setType_waste(String type_waste) {
        this.type_waste = type_waste;
    }

    public List<RRV> getRrvs() {
        return rrvs;
    }

    public void setRrvs(List<RRV> rrvs) {
        this.rrvs = rrvs;
    }

    public List<BRV> getBrvs() {
        return brvs;
    }

    public void setBrvs(List<BRV> brvs) {
        this.brvs = brvs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Storage storage = (Storage) o;

        if (Storage_id != storage.Storage_id) return false;
        if (Capacity != storage.Capacity) return false;
        if (name != null ? !name.equals(storage.name) : storage.name != null) return false;
        if (divs != null ? !divs.equals(storage.divs) : storage.divs != null) return false;
        if (trvs != null ? !trvs.equals(storage.trvs) : storage.trvs != null) return false;
        if (type_waste != null ? !type_waste.equals(storage.type_waste) : storage.type_waste != null) return false;
        if (rrvs != null ? !rrvs.equals(storage.rrvs) : storage.rrvs != null) return false;
        return brvs != null ? brvs.equals(storage.brvs) : storage.brvs == null;
    }

    @Override
    public int hashCode() {
        int result = Storage_id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + Capacity;
        result = 31 * result + (divs != null ? divs.hashCode() : 0);
        result = 31 * result + (trvs != null ? trvs.hashCode() : 0);
        result = 31 * result + (type_waste != null ? type_waste.hashCode() : 0);
        result = 31 * result + (rrvs != null ? rrvs.hashCode() : 0);
        result = 31 * result + (brvs != null ? brvs.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return  "" + Storage_id + ", Назва = " + name;
    }
}
