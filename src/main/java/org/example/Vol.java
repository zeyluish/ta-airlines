package org.example;

import java.util.ArrayList;

public class Vol {
    int numeroVol;
    String origine;
    String destination;
    String dateHeureDepart;
    String dateHeureArrive;
    static String etat;
    Avion avionAffecte;
    static ArrayList<Vol> planning = new ArrayList();
    Pilote piloteAffecte;
    static ArrayList personnelCabinesAffecte = new ArrayList();
    Aeroport departAeroportAffecte;
    Aeroport arriveAeroportAffecte;
    static ArrayList<Passager> passagerAffecte = new ArrayList();
    static ArrayList<Reservation> listeReservation = new ArrayList();

    public Vol(int numeroVol, String origine, String destination, String dateHeureDepart, String dateHeureArrive, String etat) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrive = dateHeureArrive;
        this.avionAffecte = null;
        this.etat = etat;
        departAeroportAffecte = null;
        arriveAeroportAffecte = null;
    }

    public static void annulerVol(Vol vol){
        vol.etat = "Annulé";
    }

    public static void planifierVol(ArrayList<Vol> vols, String periode){
        System.out.println("Planification des vols pour la période : " + periode);

        for (Vol vol : vols) {
            if (vol.dateHeureDepart.startsWith(periode)) {
                if (!planning.contains(vol)) {
                    planning.add(vol);
                    System.out.println("Vol ajouté : " + vol);
                } else {
                    System.out.println("Le vol est déjà planifié : " + vol);
                }
            }
        }
        System.out.println("Planning complet :");
        for (Vol v : planning) {
            System.out.println(v);
        }
    }


    public void modifierVol(String attribut, String nouvelleValeur) {
        switch (attribut.toLowerCase()) {
            case "origine":
                this.origine = nouvelleValeur;
                break;
            case "destination":
                this.destination = nouvelleValeur;
                break;
            case "dateheuredepart":
                this.dateHeureDepart = nouvelleValeur;
                break;
            case "dateheurearrive":
                this.dateHeureArrive = nouvelleValeur;
                break;
            case "etat":
                this.etat = nouvelleValeur;
                break;
            default:
                System.out.println("Attribut inconnu : " + attribut);
                return;
        }
        System.out.println("Le vol a été modifié : " + this);
    }

    public void ListingPassager(){
        for (int i = 0; i < passagerAffecte.size(); i++) {
            System.out.println("Nom : " + passagerAffecte.get(i).getNom() + ", Identifiant : " + passagerAffecte.get(i).getIdentifiant());
        }
    }

    public String toString() {
        String s = "Numero vol : " + numeroVol + ", Origine : " + origine + ", Destination : " + destination + ", Date heure arrivée : " + dateHeureArrive + ", DateHeureDepart : " + dateHeureDepart + ", etat : " + etat;
        if (departAeroportAffecte != null){
            s += ", aéroport de départ : "+ departAeroportAffecte.nom ;
        } if (arriveAeroportAffecte != null){
            s += ", aéroport d'arrivée : "+ arriveAeroportAffecte.nom;
        }
        if (personnelCabinesAffecte.size() > 0){
            s+= personnelCabinesAffecte.toString();
        }
        return s;
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

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Pilote getPiloteAffecte() {
        return piloteAffecte;
    }

    public void setPiloteAffecte(Pilote piloteAffecte) {
        this.piloteAffecte = piloteAffecte;
    }

    public Aeroport getDepartAeroportAffecte() {
        return departAeroportAffecte;
    }

    public void setDepartAeroportAffecte(Aeroport departAeroportAffecte) {
        this.departAeroportAffecte = departAeroportAffecte;
    }

    public static ArrayList getPersonnelCabinesAffecte() {
        return personnelCabinesAffecte;
    }

    public static void setPersonnelCabinesAffecte(ArrayList personnelCabinesAffecte) {
        Vol.personnelCabinesAffecte = personnelCabinesAffecte;
    }
}
