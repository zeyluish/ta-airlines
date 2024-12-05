package org.example;

import java.util.UUID;

public class Employe extends Personne {
    private int numeroEmploye;
    private String dateEmbauche;
    String Role;

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

    public String toString() {
        String s = "Numéro d'employé : " + numeroEmploye + "\nNom de l'employé : " + nom + "\nAdresse de l'employé : " + adresse + "\nContact de l'employé : " + contact + "\nDate d'embauche : " + dateEmbauche;
        return s;
    }


    public void obtenirRole() {
        switch (Role) {
            case "pilote":
                System.out.println("Cet employé est un Pilote");
                break;
            case "cabine":
                System.out.println("Cet employé est un Personnel Cabine");
        }
    }
}
