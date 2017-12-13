package com.Entity;

import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Nuclide_list")
public class Nuclide_list {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nuclide_list_id")
    private  Integer nuclide_list_id;

    @Column(name = "Amount")
    private  double amount;

    @Column(name = "Activity")
    private double activity;

    public   Nuclide_list()
    {

    }
    @OneToMany(
            mappedBy = "nuclide_list",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )   private List<Div> divs = new ArrayList<>();

    @OneToMany(
            mappedBy = "nuclide_list",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )   private List<TRV> trvs = new ArrayList<>();

    @OneToMany(
            mappedBy = "nuclide_list",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )   private List<RRV> rrvs = new ArrayList<>();

    @OneToMany(
            mappedBy = "nuclide_list",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )   private List<BRV> brvs = new ArrayList<>();
    @OneToMany(
            mappedBy = "nuclide_list",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )   private List<Element_list> element_lists = new ArrayList<>();

    public Integer getNuclide_list_id() {
        return nuclide_list_id;
    }

    public void setNuclide_list_id(Integer nuclide_list_id) {
        this.nuclide_list_id = nuclide_list_id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getActivity() {
        return activity;
    }

    public void setActivity(double activity) {
        this.activity = activity;
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

    public List<Element_list> getElement_lists() {
        return element_lists;
    }

    public void setElement_lists(List<Element_list> element_lists) {
        this.element_lists = element_lists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Nuclide_list that = (Nuclide_list) o;

        if (Double.compare(that.amount, amount) != 0) return false;
        if (Double.compare(that.activity, activity) != 0) return false;
        if (nuclide_list_id != null ? !nuclide_list_id.equals(that.nuclide_list_id) : that.nuclide_list_id != null)
            return false;
        if (divs != null ? !divs.equals(that.divs) : that.divs != null) return false;
        if (trvs != null ? !trvs.equals(that.trvs) : that.trvs != null) return false;
        if (rrvs != null ? !rrvs.equals(that.rrvs) : that.rrvs != null) return false;
        if (brvs != null ? !brvs.equals(that.brvs) : that.brvs != null) return false;
        return element_lists != null ? element_lists.equals(that.element_lists) : that.element_lists == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nuclide_list_id != null ? nuclide_list_id.hashCode() : 0;
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(activity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (divs != null ? divs.hashCode() : 0);
        result = 31 * result + (trvs != null ? trvs.hashCode() : 0);
        result = 31 * result + (rrvs != null ? rrvs.hashCode() : 0);
        result = 31 * result + (brvs != null ? brvs.hashCode() : 0);
        result = 31 * result + (element_lists != null ? element_lists.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return  nuclide_list_id +
                ", Кількість = " + amount +
                ", Активність = " + activity;
    }
}
