package org.example;

import java.util.UUID;

public class Employe extends Personne {
    private int numeroEmploye;
    private String dateEmbauche;

    public Employe(String nom, String adresse, String contact, String dateEmbauche, int numeroEmploye) {
        super(nom, adresse, contact);
        this.dateEmbauche = dateEmbauche;
        this.numeroEmploye = numeroEmploye;
    }

    public int getNumeroEmploye() {
        return numeroEmploye;
    }

    public void setNumeroEmploye(int numeroEmploye) {
        this.numeroEmploye = numeroEmploye;
    }

    public String getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(String dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }
}
