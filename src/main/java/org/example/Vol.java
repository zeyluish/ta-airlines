package org.example;

import java.util.ArrayList;

public class Vol {
    int numeroVol;
    String origine;
    String destination;
    String dateHeureDepart;
    String dateHeureArrive;
    boolean etat;
    Avion avionAffecte;
    static ArrayList planning = new ArrayList();

    public Vol(int numeroVol, String origine, String destination, String dateHeureDepart, String dateHeureArrive, boolean etat) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrive = dateHeureArrive;
        this.avionAffecte = null;
        this.etat = etat;
    }

    public void annulerVol(int numeroVol){

    }
    public static void planifierVol(ArrayList vol){
        for (int i = 0; i < vol.size(); i++) {
            planning.add(vol.get(i));
        }
        System.out.println(planning);
    }

    public void modifierVol(int numeroVol){

    }
    public void ListingPassager(int numeroVol){

    }

    public String toString() {
        return "Numero vol : " + numeroVol + ", Origine : " + origine + ", Destination : " + destination + "Date heure arrivée : " + dateHeureArrive + ", DateHeureDepart : " + dateHeureDepart + ", etat : " + etat;
    }

    public Avion getAvionAffecte() {
        return avionAffecte;
    }

    public void setAvionAffecte(Avion avionAffecte) {
        this.avionAffecte = avionAffecte;
    }

    public ArrayList getPlanning() {
        return planning;
    }

    public void setPlanning(ArrayList planning) {
        this.planning = planning;
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
        return dateHeureDepart;
    }

    public void setDateHeureDepart(String dateHeureDepart) {
        this.dateHeureDepart = dateHeureDepart;
    }

    public String getDateHeureArrive() {
        return dateHeureArrive;
    }

    public void setDateHeureArrive(String dateHeureArrive) {
        this.dateHeureArrive = dateHeureArrive;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }
}