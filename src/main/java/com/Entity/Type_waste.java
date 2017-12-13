package com.Entity;


import javax.persistence.*;

@Entity
@Table(name = "Type_waste")
public class Type_waste {
    @Id
    @Column(name = "waste")
    private String waste;


    @Column(name = "type_id")
    private int type_id;

    public Type_waste() {

    }


}
