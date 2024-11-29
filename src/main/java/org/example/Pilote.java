package org.example;

public class Pilote extends Employe{
    private String license;
    private int heuresDeVol;

    public Pilote(String nom, String adresse, String contact, String dateEmbauche, int numeroEmploye, String license, int heuresDeVol) {
        super(nom, adresse, contact, dateEmbauche, numeroEmploye);
        this.license = license;
        this.heuresDeVol = heuresDeVol;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public int getHeuresDeVol() {
        return heuresDeVol;
    }

    public void setHeuresDeVol(int heuresDeVol) {
        this.heuresDeVol = heuresDeVol;
    }
}
