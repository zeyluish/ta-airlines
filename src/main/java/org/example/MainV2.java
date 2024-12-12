package org.example;


import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

import static org.example.Aeroport.*;
import static org.example.Aeroport.affecterVol;
import static org.example.Avion.importAvion;
import static org.example.Avion.listeAvions;
import static org.example.Reservation.obtenirNumeroReservation;
import static org.example.Reservation.saveReservation;
import static org.example.Vol.*;

public class MainV2 {
    public static void main(String[] args) throws IOException {
        //Importation des avions, des vols et des Aéroports
        importAvion();
        importVol();
        importAeroport();
        System.out.println(listeVol.get(0));

        //Utilisation de l'API
        Passager passager1 = RandomUserClient.getRandomUser();
        Passager passager2 = RandomUserClient.getRandomUser();

        Pilote pilote1 = new Pilote("JP", "chez lui", "tel", "10/10/10", 2222,"licence", 13);
        Pilote pilote2 = new Pilote("Gab", "ahbdfbazdba", "00000000", "101010", 0012, "llll", 11);

        PersonnelCabine personnelCabine1 = new PersonnelCabine("Sophie", "8 rue AAAA", "0122334455", "12/12/12", 44444, "stiwart");
        PersonnelCabine personnelCabine2 = new PersonnelCabine("Alice", "15 rue BBBB", "0654321987", "01/01/01", 55555, "stiwart");
        PersonnelCabine personnelCabine3 = new PersonnelCabine("Thomas", "22 avenue CCCC", "0787654321", "15/03/99", 66666, "stiwart");
        PersonnelCabine personnelCabine4 = new PersonnelCabine("Emma", "5 boulevard DDDD", "0123456789", "10/10/10", 77777, "stiwart");

        planifierVol(listeVol, "2024-12-05");
        System.out.println("\nAnnuler un vol : ");
        listeVol.get(0).annulerVol();
        System.out.println( listeVol.get(0));

        System.out.println("\nReservation de vol par un passager : ");
        passager1.reserverVol(listeVol.get(5));
        passager1.reserverVol(listeVol.get(2));
        passager2.reserverVol(listeVol.get(5));

        System.out.println("\nListing passager : ");
        listeVol.get(5).ListingPassager();

        System.out.println("\nEcriture dans le fichier reservation.csv : ");
        saveReservation(obtenirNumeroReservation(passager1)); // écriture dans le fichier reservation.csv

        System.out.println("\nListe de réservation par un passager : ");
        passager1.obtenirReservations();

        System.out.println("\nAffectation d'un pilote à un vol : ");
        pilote1.affecterVol(listeVol.get(5));
        pilote2.affecterVol(listeVol.get(5));

        System.out.println("\nObtenir les infos d'un pilote : ");
        pilote1.obtenirInfos();

        System.out.println("\nAffectation du personel cabine : ");
        personnelCabine1.affecterVol(listeVol.get(5));
        personnelCabine2.affecterVol(listeVol.get(5));
        personnelCabine3.affecterVol(listeVol.get(5));
        personnelCabine4.affecterVol(listeVol.get(5)); //Ne peux pas être affecté car déjà au max

        System.out.println("\nInfos du personel cabine : ");
        personnelCabine1.obtenirVol(listeVol.get(5));

        System.out.println("\nDescription du vol  : " + listeVol.get(5));

        System.out.println("\nAffectation d'un aéroport de départ et d'arrivé ");
        affecterVol(listeVol.get(0), listeAeroport.get(1),listeAeroport.get(0));
        listeAeroport.get(1).afficherVols();

        System.out.println("\nModification des instances : ");
        listeAeroport.get(1).modifierAeroport("Ville", "Londre proche");
        listeAvions.get(2).modifierAvion("capacite","500");

        System.out.println("\nAffectation d'un avion à un vol : ");
        listeAvions.get(2).affecterVol(listeVol.get(9));
        listeAvions.get(2).affecterVol(listeVol.get(10));
        listeAvions.get(2).affecterVol(listeVol.get(5));
    }
}