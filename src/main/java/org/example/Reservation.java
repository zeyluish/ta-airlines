package org.example;

public class Reservation {
    int numeroReservation;
    String dateReservation;

    public Reservation(int numeroReservation, String dateReservation) {
        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;
    }

    public void confirmerReservation() {

    }
    public void annulerReservation() {

    }
    public void modifierReservation() {

    }
    public String toString() {
        return "Reservation{" +
                "numeroReservation=" + numeroReservation +
                ", dateReservation='" + dateReservation + '\'' +
                '}';
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
}
