package org.example;

public class Aeroport {
    String nom;
    String ville;
    String description;
    Vol volAffecte;


    public Aeroport(String nom, String ville, String description) {
        this.nom = nom;
        this.ville = ville;
        this.description = description;
        volAffecte = null;
    }

    public void affecterVol(Vol vol) {
        if (volAffecte == null && vol.aeroportAffecte == null) {
            volAffecte = vol;
            vol.aeroportAffecte = this;
            System.out.println("L'aéroport a bien été affecté");
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
