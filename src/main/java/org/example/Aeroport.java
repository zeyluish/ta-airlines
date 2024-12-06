package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Aeroport {
    String nom;
    String ville;
    String description;
    private ArrayList<Vol> volAffecte = new ArrayList<>();
    static ArrayList<Aeroport> listeAeroport = new ArrayList<>();


    public Aeroport(String nom, String ville, String description) {
        this.nom = nom;
        this.ville = ville;
        this.description = description;
    }

    public static void affecterVol(Vol vol, Aeroport departAeroport, Aeroport arriveAeroport) {
        if (vol.departAeroportAffecte == null && vol.arriveAeroportAffecte == null) {
            departAeroport.volAffecte.add(vol);
            arriveAeroport.volAffecte.add(vol);
            vol.departAeroportAffecte = departAeroport;
            vol.arriveAeroportAffecte = arriveAeroport;
            System.out.println("Le vol " + "a bien eu ses aéroports de départ et d'arrivé affectés");
        } else {
            System.out.println("L'aéroport ne peut pas être affecté");
        }
    }

    public void afficherVols() {
        if (volAffecte.isEmpty()) {
            System.out.println("Aucun vol n'est affecté à cet aéroport.");
        } else {
            System.out.println("Liste des vols affectés à cet aéroport :");
            for (Vol vol : volAffecte) {
                System.out.println("- " + vol);
            }
        }
    }

    public void modifierAeroport(String attribut, String nouvelleValeur){
        switch (attribut.toLowerCase()) {
            case "nom":
                this.nom = nouvelleValeur;
                break;
            case "ville":
                this.ville = nouvelleValeur;
                break;
            case "description":
                this.description = description;
            default:
                System.out.println("Attribut inconnu");
                return;
        }
        System.out.println("L'aéroport a bien été modifié : " + this);
    }

    public static void importAeroport() {
        String filePath = "src/aeroport.csv";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length >= 3) {
                    try {
                        String nom = parts[0];
                        String ville = parts[1];
                        String description = parts[2];

                        Aeroport aeroport = new Aeroport(nom, ville, description);
                        listeAeroport.add(aeroport);
                    } catch (Exception e) {
                        System.out.println("Erreur sur cette ligne : " + line);
                    }
                } else {
                    System.out.println("Ligne mal formée, ignorée : " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }

        System.out.println("Importation terminée. Nombre d'aéroports importés : " + listeAeroport.size());
    }

    @Override
    public String toString() {
        String s = "nom : " + nom + ", ville : " + ville + ", description : " + description;
        return s;
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
