package org.example;

import java.util.ArrayList;

public class Aeroport {
    String nom;
    String ville;
    String description;
    private static ArrayList<Vol> volAffecte = new ArrayList<>();


    public Aeroport(String nom, String ville, String description) {
        this.nom = nom;
        this.ville = ville;
        this.description = description;
    }

    public static void affecterVol(Vol vol, Aeroport departAeroport, Aeroport arriveAeroport) {
        if (vol.departAeroportAffecte == null && vol.arriveAeroportAffecte == null) {
            volAffecte.add(vol);
            vol.departAeroportAffecte = departAeroport;
            vol.arriveAeroportAffecte = arriveAeroport;
            System.out.println("Le vol " + "a bien eu ses aéroports de départ et d'arrivé affectés");
        } else {
            System.out.println("L'aéroport ne peut pas être affecté");
        }
    }

    @Override
    public String toString() {
        return "Aeroport{" +
                "nom='" + nom + '\'' +
                ", ville='" + ville + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
