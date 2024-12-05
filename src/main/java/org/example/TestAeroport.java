package org.example;

import java.util.ArrayList;

import static org.example.Aeroport.affecterVol;
import static org.example.Vol.annulerVol;
import static org.example.Vol.planifierVol;


public class TestAeroport {
    public static void main(String[] args) {
        ArrayList listeVol = new ArrayList();

        Avion avion1 = new Avion(78,"Airbus", 200);
        Avion avion2 = new Avion(92,"Boieng", 150);

        Vol vol1 = new Vol(1,"Paris", "Oulu","2024-12-05 10:00","2024-12-05 12:00", "A l'heure");
        Vol vol2 = new Vol(2,"Oulu", "Paris","2024-12-05 11:30","2024-12-05 13:30","A l'heure");
        Vol vol3 = new Vol(3,"Paris", "Rome","2024-12-05 13:45", "2024-12-05 16:00", "A l'heure");

        Aeroport CDG = new Aeroport("CDG", "Paris", "Aeroport CDG");
        Aeroport Oulu = new Aeroport("OuluAirport", "Oulu", "Aeroport de Oulu");

        affecterVol(vol2,Oulu,CDG);
        System.out.println(vol1);

        Reservation reservation1 = new Reservation(101, "2024-12-10");

        avion1.affecterVol(vol1);
        avion1.affecterVol(vol2);
        avion1.affecterVol(vol3);

    }
}
