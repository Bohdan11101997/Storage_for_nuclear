package com.Entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Chemical_element_nuclide")
public class Chemical_element_nuclide {

    @Id
    @Column(name = "Nuclide_symbol")
    private  String Nuclide_symbol;


    @Column(name = "Name_of_nuclid")
    private  String name_of_nuclide;


    @Column(name = "Z")
    private int Z;

    @Column(name = "N")
    private  int N;

    @Column(name = "Isotope_mass")
    private  double Isotope_mass;

        @Column(name = "Palf_life")
    private double Palf_life;


        @OneToMany(mappedBy = "chemical_element_nuclide",
                cascade = CascadeType.ALL,
                  orphanRemoval = true
              )
        private List<Chemical_element> chemical_elements= new ArrayList<>();

        public Chemical_element_nuclide()
        {}

}
