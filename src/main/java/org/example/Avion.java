package org.example;

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

    public void affecterVol(Vol vol){
        if (volAffecte == null & vol.avionAffecte == null){
            volAffecte = vol;
            vol.avionAffecte = this;
            System.out.println("L'avion a bien été affecté au vol : " + vol);
        } else {
            System.out.println(" l'avion ne peut pas être affecté à ce vol");
        }

    }
    public void VerifierDisponibilite(){

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
