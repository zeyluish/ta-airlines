package org.example;



public class Main {
    public static void main(String[] args) {
        Personne p1 = new Personne("Téo GAUDIN", "69 rue Emile AUGIER", "0783583150");
        p1.obtenirInfos();
        Pilote pilote1 = new Pilote("JP", "chez lui", "tel", "10/10/10", 2222,"licence", 13);
        PersonnelCabine personnelCabine1 = new PersonnelCabine("Sophie", "8 rue AAAA", "0122334455", "12/12/12", 44444, "stiwart");
        PersonnelCabine personnelCabine2 = new PersonnelCabine("Alice", "15 rue BBBB", "0654321987", "01/01/01", 55555, "stiwart");
        PersonnelCabine personnelCabine3 = new PersonnelCabine("Thomas", "22 avenue CCCC", "0787654321", "15/03/99", 66666, "stiwart");
        PersonnelCabine personnelCabine4 = new PersonnelCabine("Emma", "5 boulevard DDDD", "0123456789", "10/10/10", 77777, "stiwart");
        PersonnelCabine personnelCabine5 = new PersonnelCabine("Lucas", "18 rue EEEE", "0987654321", "20/05/15", 88888, "stiwart");
        PersonnelCabine personnelCabine6 = new PersonnelCabine("Marie", "30 impasse FFFF", "0678901234", "25/12/20", 99999, "stiwart");

        Vol vol1 = new Vol(1111, "Paris", "Mexico", "19h", "20h", "A l'heure");
        pilote1.affecterVol(vol1);
        personnelCabine1.affecterVol(vol1);
        personnelCabine2.affecterVol(vol1);
        personnelCabine3.affecterVol(vol1);
        personnelCabine4.affecterVol(vol1);
        personnelCabine5.affecterVol(vol1);
        personnelCabine6.affecterVol(vol1);

    }
}