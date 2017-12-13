package com.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Element_list")
public class Element_list {

    @Id
    @Column(name = "Id_element")
    private  int Id_element;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "number")
    private Chemical_element chemical_element;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "List_id")
    private Nuclide_list nuclide_list;
public Element_list()
{

}
    public int getId_element() {

        return Id_element;
    }

    public void setId_element(int id_element) {
        Id_element = id_element;
    }

    public Chemical_element getChemical_element() {
        return chemical_element;
    }

    public void setChemical_element(Chemical_element chemical_element) {
        this.chemical_element = chemical_element;
    }

    public Nuclide_list getNuclide_list() {
        return nuclide_list;
    }

    public void setNuclide_list(Nuclide_list nuclide_list) {
        this.nuclide_list = nuclide_list;
    }

}
