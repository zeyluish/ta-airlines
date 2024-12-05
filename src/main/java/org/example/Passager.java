package org.example;

import java.util.UUID;

public class Passager extends Personne {
    private String passeport;

    public Passager(UUID identifiant, String nom, String adresse, String contact, String passeport) {
        super(nom, adresse, contact);
        this.passeport = passeport;
    }

    public void reserverVol() {

    }
    public void annulerReservation() {

    }
    public void obtenirReservation(){

    }

    public String getPasseport() {
        return passeport;
    }

    public void setPasseport(String passeport) {
        this.passeport = passeport;
    }
}
