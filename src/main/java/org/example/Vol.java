package org.example;

public class Vol {
    int numeroVol;
    String origine;
    String destination;
    String DateHeureDepart;
    String DateHeureArrive;
    boolean etat;
    Avion avionAffecte;

    public Vol(int numeroVol, String origine, String destination, String dateHeureDepart, String dateHeureArrive, boolean etat) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        DateHeureDepart = dateHeureDepart;
        DateHeureArrive = dateHeureArrive;
        this.etat = etat;
        avionAffecte = null;
    }

    public void annulerVol(int numeroVol){

    }
    public void planifierVol(int numeroVol){

    }
    public void modifierVol(int numeroVol){

    }
    public void ListingPassager(int numeroVol){

    }

    public String toString() {
        return "Numero vol : " + numeroVol + ", Origine : " + origine + ", Destination : " + destination + "Date heure arrivée : " + DateHeureArrive + ", DateHeureDepart : " + DateHeureDepart + ", etat : " + etat;
    }

    public int getNumeroVol() {
        return numeroVol;
    }

    public void setNumeroVol(int numeroVol) {
        this.numeroVol = numeroVol;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDateHeureDepart() {
        return DateHeureDepart;
    }

    public void setDateHeureDepart(String dateHeureDepart) {
        DateHeureDepart = dateHeureDepart;
    }

    public String getDateHeureArrive() {
        return DateHeureArrive;
    }

    public void setDateHeureArrive(String dateHeureArrive) {
        DateHeureArrive = dateHeureArrive;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }
}
