package org.example;

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

    public String toString() {
        return
                "numeroReservation = " + numeroReservation +
                ", dateReservation = '" + dateReservation + '\''
                + " Etat = " + isActive;
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
