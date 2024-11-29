package org.example;

import java.util.ArrayList;

import static org.example.Vol.planifierVol;


public class TestAeroport {
    public static void main(String[] args) {
        ArrayList listeVol = new ArrayList();
        Avion avion1 = new Avion(78,"Airbus", 200);
        Avion avion2 = new Avion(92,"Boieng", 150);

        Vol vol1 = new Vol(1,"Paris", "Oulu","19","22",false);
        Vol vol2 = new Vol(2,"Oulu", "Paris","19","22",false);
        System.out.println(avion1.toString());
        avion1.affecterVol(vol1);
        avion2.affecterVol(vol2);
        listeVol.add(vol1);
        listeVol.add(vol2);

        planifierVol(listeVol);


    }
}
