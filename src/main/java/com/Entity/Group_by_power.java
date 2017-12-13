package com.Entity;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Group_by_power")
public class Group_by_power {


    @Id
    @Column(name = "Group_by_power")
    private String Group_by_power;

    @Column(name = "Number_of_power")
    private int Number_of_power;

    @OneToMany(
            mappedBy = "group_by_power",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )   private List<TRV> trvs = new ArrayList<>();

    @OneToMany(
            mappedBy = "group_by_power",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )   private List<BRV> brvs  = new ArrayList<>();

    Group_by_power()
    {

    }

    public String getGroup_by_power() {
        return Group_by_power;
    }

    public void setGroup_by_power(String group_by_power) {
        Group_by_power = group_by_power;
    }

    public int getNumber_of_power() {
        return Number_of_power;
    }

    public void setNumber_of_power(int number_of_power) {
        Number_of_power = number_of_power;
    }

    public List<TRV> getTrvs() {
        return trvs;
    }

    public void setTrvs(List<TRV> trvs) {
        this.trvs = trvs;
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

        Group_by_power that = (Group_by_power) o;

        if (Number_of_power != that.Number_of_power) return false;
        if (Group_by_power != null ? !Group_by_power.equals(that.Group_by_power) : that.Group_by_power != null)
            return false;
        if (trvs != null ? !trvs.equals(that.trvs) : that.trvs != null) return false;
        return brvs != null ? brvs.equals(that.brvs) : that.brvs == null;
    }

    @Override
    public int hashCode() {
        int result = Group_by_power != null ? Group_by_power.hashCode() : 0;
        result = 31 * result + Number_of_power;
        result = 31 * result + (trvs != null ? trvs.hashCode() : 0);
        result = 31 * result + (brvs != null ? brvs.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "" + Group_by_power;
    }
}
