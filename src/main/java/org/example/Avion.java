package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Avion {
    int immatriculation;
    String modele;
    int capacite;
    Vol volAffecte;

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

    public Vol getVolAffecte() {
        return volAffecte;
    }

    public void setVolAffecte(Vol volAffecte) {
        this.volAffecte = volAffecte;
    }

    @Override
    public String toString() {
        return "Immatriculation : " + immatriculation + ", Modele : " + modele + ", Capacite : " + capacite + "Vol affecté : " + volAffecte;
    }

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


}
