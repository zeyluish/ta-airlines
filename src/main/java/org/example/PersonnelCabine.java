package org.example;

import static org.example.Vol.personnelCabinesAffecte;

public class PersonnelCabine extends Employe{
    private String qualification;

    public PersonnelCabine(String nom, String adresse, String contact, String dateEmbauche, int numeroEmploye, String qualification) {
        super(nom, adresse, contact, dateEmbauche, numeroEmploye);
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void affecterVol(Vol vol) {
        if (personnelCabinesAffecte.size() >= 3)
            System.out.println("L'équipage du vol " + vol.numeroVol + " est complet.");
        else {
            personnelCabinesAffecte.add(this);
            System.out.println("Le personnel de cabine à bien été affecter au vol " + vol.numeroVol + ".");
        }
    }
}
