package org.example;

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

    public void affecterVol () {

    }
}
