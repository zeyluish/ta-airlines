package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Avion {
    int immatriculation;
    String modele;
    int capacite;
    Vol volAffecte;
    static ArrayList<Avion> listeAvions = new ArrayList<>();

    public Avion(int immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
        volAffecte = null;
    }

    public void affecterVol(Vol vol) {
        if (VerifierDisponibilite(vol.dateHeureDepart, vol.dateHeureArrive)) {
            this.volAffecte = vol;
            vol.avionAffecte = this;
            System.out.println("L'avion a été affecté au vol : " + vol);
        } else {
            System.out.println("L'avion n'est pas disponible pour les horaires de ce vol.");
        }
    }

    public boolean VerifierDisponibilite(String nouveauDepart, String nouvelleArrivee){
        if (volAffecte == null){
            return true;
        } else {
            String departExistant = volAffecte.dateHeureDepart;
            String arriveExistant = volAffecte.dateHeureArrive;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            try {
                Date dateNouveauDepart = sdf.parse(nouveauDepart);
                Date dateNouvelleArivee = sdf.parse(nouvelleArrivee);
                Date dateDepartExistant = sdf.parse(departExistant);
                Date dateArriveExistant = sdf.parse(arriveExistant);

                boolean chevauchement = !(dateNouvelleArivee.before(dateDepartExistant) || dateNouveauDepart.after(dateArriveExistant));
                return !chevauchement;
            } catch (ParseException e) {
                System.err.println("Erreur lors du parsing des dates : " + e.getMessage());
                return false;
            }
        }
    }

    public void modifierAvion(String attribut, String nouvelleValeur) {
        switch (attribut.toLowerCase()) {
            case "immatriculation":
                try {
                    this.immatriculation = Integer.parseInt(nouvelleValeur);
                } catch (NumberFormatException e) {
                    System.out.println("L'immatriculation doit être un nombre entier.");
                }
                break;
            case "modele":
                this.modele = nouvelleValeur;
                break;
            case "capacite":
                try {
                    this.capacite = Integer.parseInt(nouvelleValeur);
                } catch (NumberFormatException e) {
                    System.out.println("La capacité doit être un nombre entier.");
                }
                break;
            default:
                System.out.println("Attribut inconnu : " + attribut);
                return;
        }
        System.out.println("L'avion a bien été modifié : " + this);
    }

    public void supprimerVol(Vol vol) {
        vol.avionAffecte = null;
        this.volAffecte = null;
        System.out.println("Le vol a bien été supprimé");
    }

    public static void importAvion() {
        String filePath = "src/avion1.csv";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length >= 3) {
                    try {
                        int immatriculation = Integer.parseInt(parts[0]);
                        String modele = parts[1];
                        int capacite = Integer.parseInt(parts[2]);
                        Avion avion = new Avion(immatriculation, modele, capacite);
                        listeAvions.add(avion);
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

        System.out.println("Importation terminée. Nombre d'avions importés : " + listeAvions.size());
        for (Avion avion : listeAvions) {
            System.out.println(avion);
        }
    }

    public Vol getVolAffecte() {
        return volAffecte;
    }

    public void setVolAffecte(Vol volAffecte) {
        this.volAffecte = volAffecte;
    }

    @Override
    public String toString() {
        String s = "Immatriculation : " + immatriculation + ", Modele : " + modele + ", Capacite : " + capacite ;
        if (volAffecte != null) {
            s+= ", vol affecté { " + volAffecte.origine + " à " + volAffecte.destination + "}";
        }
        return s;
    }

// <editor-fold desc="Getter and setter">

    public int getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(int immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
// </editor-fold>
}
