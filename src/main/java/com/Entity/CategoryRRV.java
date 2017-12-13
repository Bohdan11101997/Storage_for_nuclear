package com.Entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CategoryRRV")
public class CategoryRRV {

    @Id
    @Column(name = "Category_id")
    private String  category_id;


    @Column(name = "Type")
    private  int type_category;


    @OneToMany(
            mappedBy = "category",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )   private List<RRV> rrvs = new ArrayList<>();


    public CategoryRRV() {
    }

    public int getType_category() {
        return type_category;
    }

    public void setType_category(int type_category) {
        this.type_category = type_category;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public List<RRV> getRrvs() {
        return rrvs;
    }

    public void setRrvs(List<RRV> rrvs) {
        this.rrvs = rrvs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryRRV that = (CategoryRRV) o;

        if (type_category != that.type_category) return false;
        if (category_id != null ? !category_id.equals(that.category_id) : that.category_id != null) return false;
        return rrvs != null ? rrvs.equals(that.rrvs) : that.rrvs == null;
    }

    @Override
    public int hashCode() {
        int result = category_id != null ? category_id.hashCode() : 0;
        result = 31 * result + type_category;
        result = 31 * result + (rrvs != null ? rrvs.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "" + category_id;
    }
}
