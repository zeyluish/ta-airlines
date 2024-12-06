package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
    ArrayList personnelCabinesAffecte = new ArrayList();
    Aeroport departAeroportAffecte;
    Aeroport arriveAeroportAffecte;
    ArrayList<Passager> passagerAffecte = new ArrayList();
    ArrayList<Reservation> listeReservation = new ArrayList();
    static ArrayList<Vol> listeVol = new ArrayList<>();

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
        System.out.println("Listing passager pour le vol " + this.numeroVol);
        for (int i = 0; i < passagerAffecte.size(); i++) {
            System.out.println("Nom : " + passagerAffecte.get(i).getNom() + ", Identifiant : " + passagerAffecte.get(i).getIdentifiant());
        }
    }

    public static void importVol() {
        String filePath = "src/vols.csv";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length >= 6) {
                    try {
                        int numeroVol = Integer.parseInt(parts[0]);
                        String origine = parts[1];
                        String destination = parts[2];
                        String dateHeureDepart = parts[3];
                        String dateHeureArrive = parts[4];
                        String etat = parts[5];

                        Vol vol = new Vol(numeroVol, origine, destination, dateHeureDepart, dateHeureArrive, etat);
                        listeVol.add(vol);
                    } catch (NumberFormatException e) {
                        System.out.println("Erreur de conversion sur cette ligne : " + line);
                    }
                } else {
                    System.out.println("Ligne mal formée, ignorée : " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
        System.out.println("Importation terminée. Nombre de vols importés : " + listeVol.size());
        for (Vol vol : listeVol) {
            System.out.println(vol);
        }
    }


    public String toString() {
        String s = "Numero vol : " + numeroVol + ", Origine : " + origine + ", Destination : " + destination + ", Date heure arrivée : " + dateHeureArrive + ", DateHeureDepart : " + dateHeureDepart + ", etat : " + etat;
        if (departAeroportAffecte != null){
            s += ", aéroport de départ : "+ departAeroportAffecte.nom ;
        } if (arriveAeroportAffecte != null){
            s += ", aéroport d'arrivée : "+ arriveAeroportAffecte.nom;
        }
        if (piloteAffecte != null){
            s += ", pilote : " + piloteAffecte.nom;
        }
        if (avionAffecte != null){
            s += ", avion : " + avionAffecte.modele;
        }
        if (!personnelCabinesAffecte.isEmpty()){
            s+= ", personnel cabine : ";
            for (Object personnel : personnelCabinesAffecte) {
                s += personnel + ", ";
            }
        }
        if (!listeReservation.isEmpty()){
            s+= ", nombre de réservations : " + listeReservation.size();
        }
        if (!passagerAffecte.isEmpty()){
            s+= ", nombre de passagers : " + passagerAffecte.size();
        }
        return s;
    }
// <editor-fold desc="Getter and setter">

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

    public ArrayList getPersonnelCabinesAffecte() {
        return personnelCabinesAffecte;
    }

    public void setPersonnelCabinesAffecte(ArrayList personnelCabinesAffecte) {
        this.personnelCabinesAffecte = personnelCabinesAffecte;
    }
    // </editor-fold>

}
