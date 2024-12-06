package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Reservation {
    int numeroReservation;
    String dateReservation;
    boolean isActive;
    Passager passagerAffecté;
    Vol volaffecte;

    public Reservation(int numeroReservation, String dateReservation) {
        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;
        this.isActive = true;
    }

    public void confirmerReservation() {
        if (!isActive) {
            this.isActive = true;
            System.out.println("La reservation " + this.numeroReservation + " a été confirmée");
        } else {
            System.out.println("La reservation était déjà confirmée");
        }

    }
    public void annulerReservation() {
        if (isActive) {
            this.isActive = false;
            System.out.println("La reservation " + this.numeroReservation + " a été annulée");
        } else {
            System.out.println("La réservation était déjà annulée");
        }

    }
    public void modifierReservation(String nouvelleDate) {
        this.dateReservation = nouvelleDate;
        System.out.println("La réservation " + numeroReservation + " a été mise à jour à la date : " + nouvelleDate);
    }

/*
    public static void saveReservation(Reservation reservation) {
        String filePath = "src/reservation.csv";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) // `true` pour ajouter à la fin
        {
            writer.write("Ceci est un exemple de texte.");
            writer.newLine(); // Ajoute une nouvelle ligne
            writer.write("Une autre ligne de texte.");
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());
        }
    }*/

    public String toString() {
        String s =                 "numeroReservation = " + numeroReservation +
                ", dateReservation = '" + dateReservation + '\''
                + " Etat = " + isActive;
        if (volaffecte != null) {
            s += ", volaffecte = " + volaffecte.origine + " à " + volaffecte.destination;
        }
        return s;

    }

    public int getNumeroReservation() {
        return numeroReservation;
    }

    public void setNumeroReservation(int numeroReservation) {
        this.numeroReservation = numeroReservation;
    }

    public String getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(String dateReservation) {
        this.dateReservation = dateReservation;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Passager getPassagerAffecté() {
        return passagerAffecté;
    }

    public void setPassagerAffecté(Passager passagerAffecté) {
        this.passagerAffecté = passagerAffecté;
    }

    public Vol getVolaffecte() {
        return volaffecte;
    }

    public void setVolaffecte(Vol volaffecte) {
        this.volaffecte = volaffecte;
    }
}
