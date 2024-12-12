package org.example;


import java.util.ArrayList;
import java.util.UUID;

import static org.example.Aeroport.*;
import static org.example.Aeroport.affecterVol;
import static org.example.Reservation.obtenirNumeroReservation;
import static org.example.Reservation.saveReservation;
import static org.example.Vol.importVol;
import static org.example.Vol.planifierVol;

public class Main {
    public static void main(String[] args) {
        ArrayList listeVol = new ArrayList();


        Avion avion1 = new Avion(78,"Airbus", 200);
        Avion avion2 = new Avion(92,"Boieng", 150);

        Vol vol1 = new Vol(1,"Paris", "Oulu","2024-12-05 10:00","2024-12-05 12:00", "A l'heure");
        Vol vol2 = new Vol(2,"Oulu", "Paris","2024-12-05 11:30","2024-12-05 13:30","A l'heure");
        Vol vol3 = new Vol(3,"Paris", "Rome","2024-12-05 13:45", "2024-12-05 16:00", "A l'heure");
        Vol vol4 = new Vol(4,"Rome", "Paris", "2024-12-06 13:45", "2024-12-06 13:45", "A l'heure");
        listeVol.add(vol3);
        listeVol.add(vol2);
        listeVol.add(vol1);
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

        planifierVol(listeVol, "2024-12-05");

        System.out.println("\nAnnuler un vol : ");
        vol4.annulerVol();
        System.out.println(vol4);

        System.out.println("\nReservation de vol par un passager : ");
        passager1.reserverVol(vol1);
        passager2.reserverVol(vol1);
        passager2.reserverVol(vol2);

        System.out.println("\nListing passager : ");
        vol1.ListingPassager();

        System.out.println("\nEcriture dans le fichier reservation.csv : ");
        saveReservation(obtenirNumeroReservation(passager1)); // écriture dans le fichier reservation.csv

        System.out.println("\nListe de réservation par un passager : ");
        passager1.obtenirReservations();

        System.out.println("\nAffectation d'un pilote à un vol : ");
        pilote1.affecterVol(vol1);
        pilote2.affecterVol(vol1);

        System.out.println("\nObtenir les infos d'un pilote : ");
        pilote1.obtenirInfos();

        System.out.println("\nAffectation du personel cabine : ");
        personnelCabine1.affecterVol(vol1);
        personnelCabine2.affecterVol(vol1);
        personnelCabine3.affecterVol(vol1);
        personnelCabine4.affecterVol(vol1); //Ne peux pas être affecté car déjà au max

        System.out.println("\nInfos du personel cabine : ");
        personnelCabine1.obtenirVol(vol1);

        System.out.println("\nDescription du vol  : " + vol1);

        System.out.println("\nAffectation d'un aéroport de départ et d'arrivé ");
        affecterVol(vol2,Oulu,CDG);
        affecterVol(vol1,Oulu,CDG);
        CDG.afficherVols();

        System.out.println("\nModification des instances : ");
        CDG.modifierAeroport("Ville", "Paris Proche");
        avion1.modifierAvion("capacite", "250");

        System.out.println("\nAffectation d'un avion à un vol : ");
        avion1.affecterVol(vol1);
        avion1.affecterVol(vol2); //Chevauche les horaires du vol 1
        avion1.affecterVol(vol3);
    }
}