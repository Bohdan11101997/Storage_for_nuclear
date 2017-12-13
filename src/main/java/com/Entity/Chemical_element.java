package com.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Chemical_element")
public class Chemical_element {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Number")
    private  Long number;

    @Column(name = "Name_of_element")
    private String name_of_element;

    @Column(name = "Formula")
    private String formula;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Nuclide_symbol")
    private Chemical_element_nuclide chemical_element_nuclide;

    @OneToMany(
            mappedBy = "chemical_element",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )   private List<Element_list> element_lists = new ArrayList<>();


    public  Chemical_element(){


    }

}
