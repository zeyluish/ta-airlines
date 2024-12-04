package org.example;



public class Main {
    public static void main(String[] args) {
        Personne p1 = new Personne("Téo GAUDIN", "69 rue Emile AUGIER", "0783583150");
        p1.obtenirInfos();
        Pilote pilote1 = new Pilote("JP", "chez lui", "tel", "10/10/10", 111111,"licence", 13);
        Vol vol1 = new Vol(1111, "Paris", "Mexico", "19h", "20h", "A l'heure");
        pilote1.affecterVol(vol1);
    }
}