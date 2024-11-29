package org.example;



public class Main {
    public static void main(String[] args) {
        Personne p1 = new Personne("Téo GAUDIN", "69 rue Emile AUGIER", "0783583150");
        p1.obtenirInfos();
        Pilote pilote1 = new Pilote("JP", "chez lui", "tel", "10/10/10", 111111,"licence", 13);
        Vol vol1 = new Vol(1,"Paris", "Oulu","19","22",false);
        pilote1.obtenirVol(vol1);

    }
}