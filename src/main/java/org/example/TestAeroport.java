package org.example;

import java.util.ArrayList;

import static org.example.Vol.annulerVol;
import static org.example.Vol.planifierVol;


public class TestAeroport {
    public static void main(String[] args) {
        ArrayList listeVol = new ArrayList();

        Avion avion1 = new Avion(78,"Airbus", 200);
        Avion avion2 = new Avion(92,"Boieng", 150);

        Vol vol1 = new Vol(1,"Paris", "Oulu","19","22", "A l'heure");
        Vol vol2 = new Vol(2,"Oulu", "Paris","19","22","A l'heure");

        Reservation reservation1 = new Reservation(101, "2024-12-10");

        avion1.affecterVol(vol1);
        reservation1.confirmerReservation();
        reservation1.annulerReservation();
        reservation1.modifierReservation("04/12/2024");
    }
}
