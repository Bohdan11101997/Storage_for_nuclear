package com.Entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Type_div")
public class Type_div {

    @Id
    @Column(name = "Type_div")
    private String Type_div;

    @OneToMany(
            mappedBy = "type_div",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )   private List<Div> divs = new ArrayList<>();

    Type_div()
    {}
    public String getType_div() {
        return Type_div;
    }

    public void setType_div(String type_div) {
        Type_div = type_div;
    }

    public List<Div> getDivs() {
        return divs;
    }

    public void setDivs(List<Div> divs) {
        this.divs = divs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Type_div type_div = (Type_div) o;

        if (Type_div != null ? !Type_div.equals(type_div.Type_div) : type_div.Type_div != null) return false;
        return divs != null ? divs.equals(type_div.divs) : type_div.divs == null;
    }

    @Override
    public int hashCode() {
        int result = Type_div != null ? Type_div.hashCode() : 0;
        result = 31 * result + (divs != null ? divs.hashCode() : 0);
        return result;
    }

    @Override
    public String   toString() {
        return "" + Type_div;
    }
}
