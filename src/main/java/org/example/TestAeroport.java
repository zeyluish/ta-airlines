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
        Aeroport Rome = new Aeroport("RomeAirport", "Rome", "Aeroport de Rome");

        Passager passager1 = new Passager(UUID.randomUUID(), "John Doe", "123 rue Exemple", "john.doe@email.com", "AB123456");
        Passager passager2 = new Passager(UUID.randomUUID(), "Jane Smith", "456 avenue Exemple", "jane.smith@email.com", "CD789012");

        Pilote pilote1 = new Pilote("JP", "chez lui", "tel", "10/10/10", 2222,"licence", 13);
        Pilote pilote2 = new Pilote("Gab", "ahbdfbazdba", "00000000", "101010", 0012, "llll", 11);

        PersonnelCabine personnelCabine1 = new PersonnelCabine("Sophie", "8 rue AAAA", "0122334455", "12/12/12", 44444, "stiwart");
        PersonnelCabine personnelCabine2 = new PersonnelCabine("Alice", "15 rue BBBB", "0654321987", "01/01/01", 55555, "stiwart");
        PersonnelCabine personnelCabine3 = new PersonnelCabine("Thomas", "22 avenue CCCC", "0787654321", "15/03/99", 66666, "stiwart");
        PersonnelCabine personnelCabine4 = new PersonnelCabine("Emma", "5 boulevard DDDD", "0123456789", "10/10/10", 77777, "stiwart");

        passager1.reserverVol(vol1);
        passager2.reserverVol(vol1);
        passager1.reserverVol(vol2);

        vol2.ListingPassager();

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
