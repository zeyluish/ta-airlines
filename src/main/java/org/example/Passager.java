package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

public class Passager extends Personne {
    private String passeport;
    private ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    public Passager(UUID identifiant, String nom, String adresse, String contact, String passeport) {
        super(nom, adresse, contact);
        this.passeport = passeport;
    }

    public void reserverVol(Vol vol) {
        if ( vol !=null){
            Reservation nouvelleReservation = new Reservation(reservations.size() + 1,vol.dateHeureDepart);
            nouvelleReservation.setPassagerAffecté(this);
            nouvelleReservation.setVolaffecte(vol);
            vol.listeReservation.add(nouvelleReservation);
            vol.passagerAffecte.add(this);
            reservations.add(nouvelleReservation);
            System.out.println("Le vol a été reservé avec succès par le passager : " + this.nom);
        }
    }

    public void annulerReservation(Vol vol) {
        for (Reservation reservation : reservations) {
            if (reservation.getVolaffecte() != null && reservation.getVolaffecte().equals(vol)) {
                if (reservation.isActive) {
                    reservation.annulerReservation();
                } else {
                    System.out.println("La réservation pour ce vol est déjà annulée.");
                }
                return;
            }
        }
        System.out.println("Aucune réservation trouvée pour ce vol.");
    }


    public void obtenirReservations() {
        if (reservations.isEmpty()) {
            System.out.println("Ce passager n'a aucune réservation.");
        } else {
            System.out.println("Réservations du passager " + super.nom + " :");
            for (Reservation reservation : reservations) {
                System.out.println(reservation);
            }
        }
    }

    public String toString() {
        String s = super.toString() + "\nPasseport : " + passeport;
        return s;
    }


}
