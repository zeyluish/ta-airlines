package org.example;

import java.util.ArrayList;
import java.util.UUID;

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

        Passager passager1 = new Passager(UUID.randomUUID(), "John Doe", "123 rue Exemple", "john.doe@email.com", "AB123456");
        Passager passager2 = new Passager(UUID.randomUUID(), "Jane Smith", "456 avenue Exemple", "jane.smith@email.com", "CD789012");


        passager1.reserverVol(vol1);
        passager2.reserverVol(vol1);


        vol1.ListingPassager();

        affecterVol(vol2,Oulu,CDG);
        affecterVol(vol1,Oulu,CDG);

        CDG.afficherVols();
        CDG.modifierAeroport("Ville", "Paris Proche");

        Reservation reservation1 = new Reservation(101, "2024-12-10");

        avion1.affecterVol(vol1);
        avion1.affecterVol(vol2);
        avion1.affecterVol(vol3);

        avion1.modifierAvion("capacite", "250");


    }
}
