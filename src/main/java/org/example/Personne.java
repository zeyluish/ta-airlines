package org.example;

import java.util.UUID;

public class Personne {
    private UUID identifiant = UUID.randomUUID();
    public String nom;
    public String adresse;
    public String contact;

    public Personne(String nom, String adresse, String contact) {
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }

    public UUID getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(UUID identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void obtenirInfos() { // équivalent à un toString()
        System.out.println("Les informations de " + this.nom + " sont :" + "\nIdentifiant : "+ identifiant + "\nAdresse : " + this.adresse + "\nContact : " + this.contact);
    }
}


