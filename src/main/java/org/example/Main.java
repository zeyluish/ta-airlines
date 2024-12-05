package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Personne p1 = new Personne("Téo GAUDIN", "69 rue Emile AUGIER", "0783583150");
        p1.obtenirInfos();
        Pilote pilote1 = new Pilote("JP", "chez lui", "tel", "10/10/10", 2222,"licence", 13);
        Pilote pilote2 = new Pilote("Gab", "ahbdfbazdba", "00000000", "101010", 0012, "llll", 11);
        Pilote pilote3 = new Pilote("Jack", "chez toi", "000918", "aujd", 1234,"dbaida", 23);
        Pilote pilote4 = new Pilote("Daniel", "Ici", "telephone", "210210", 2123, "dadadda", 99);
        PersonnelCabine personnelCabine1 = new PersonnelCabine("Sophie", "8 rue AAAA", "0122334455", "12/12/12", 44444, "stiwart");
        PersonnelCabine personnelCabine2 = new PersonnelCabine("Alice", "15 rue BBBB", "0654321987", "01/01/01", 55555, "stiwart");
        PersonnelCabine personnelCabine3 = new PersonnelCabine("Thomas", "22 avenue CCCC", "0787654321", "15/03/99", 66666, "stiwart");
        PersonnelCabine personnelCabine4 = new PersonnelCabine("Emma", "5 boulevard DDDD", "0123456789", "10/10/10", 77777, "stiwart");
        PersonnelCabine personnelCabine5 = new PersonnelCabine("Lucas", "18 rue EEEE", "0987654321", "20/05/15", 88888, "stiwart");
        PersonnelCabine personnelCabine6 = new PersonnelCabine("Marie", "30 impasse FFFF", "0678901234", "25/12/20", 99999, "stiwart");

        Vol vol1 = new Vol(1111, "Paris", "Mexico", "19h", "20h", "A l'heure");
        Vol vol2 = new Vol(2222, "Londres", "Tokyo", "10h", "22h", "Retardé");
        Vol vol3 = new Vol(3333, "New York", "Toronto", "14h", "15h", "Annulé");
        Vol vol4 = new Vol(4444, "Berlin", "Rome", "08h", "10h", "A l'heure");
        Vol vol5 = new Vol(5555, "Sydney", "Los Angeles", "06h", "22h", "En vol");
        Vol vol6 = new Vol(6666, "Moscou", "Istanbul", "12h", "16h", "Retardé");
        Vol vol7 = new Vol(7777, "Madrid", "Dubaï", "18h", "02h", "A l'heure");



        ArrayList<Vol> vols = new ArrayList<>();
        vols.add(vol1);
        vols.add(vol2);
        vols.add(vol3);
        vols.add(vol4);
        vols.add(vol5);
        vols.add(vol6);
        vols.add(vol7);

        pilote1.affecterVol(vol1);
        pilote2.affecterVol(vol1);
        personnelCabine1.affecterVol(vol1);
        System.out.println(vol1);
        System.out.println(vol2);



        personnelCabine2.affecterVol(vol1);
        personnelCabine3.affecterVol(vol1);
        personnelCabine4.affecterVol(vol1);
        personnelCabine5.affecterVol(vol1);
        personnelCabine6.affecterVol(vol1);


        pilote1.obtenirVol(vol2);
        personnelCabine1.obtenirVol(vol1);
        personnelCabine1.obtenirVol(vol2);
        personnelCabine1.obtenirVol(vol3);
        personnelCabine1.obtenirVol(vol4);
        personnelCabine1.obtenirVol(vol5);
        personnelCabine1.obtenirVol(vol6);



        pilote1.obtenirInfos();

        pilote2.obtenirRole();
        personnelCabine3.obtenirRole();
    }
}