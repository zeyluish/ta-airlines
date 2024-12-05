package org.example;

public class PersonnelCabine extends Employe{
    private String qualification;


    public PersonnelCabine(String nom, String adresse, String contact, String dateEmbauche, int numeroEmploye, String qualification) {
        super(nom, adresse, contact, dateEmbauche, numeroEmploye);
        this.qualification = qualification;
        this.Role = "cabine";
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void affecterVol(Vol vol) {
        if (vol.personnelCabinesAffecte.size() >= 3)
            System.out.println("L'équipage du vol " + vol.numeroVol + " est complet.");
        else {
            vol.personnelCabinesAffecte.add(this);
            System.out.println("Le personnel de cabine à bien été affecter au vol " + vol.numeroVol + ".");
        }
    }

    public void obtenirVol(Vol vol) {
        if (vol.personnelCabinesAffecte.contains(this))
            System.out.println("Le personnel cabine " + this.nom + " fait parti de l'équipage du vol " + vol.numeroVol + "\nLes informations du vol " + vol.numeroVol + " sont :" + "\nOrigine : " + vol.origine + "\nDestination : " + vol.destination + "\nDate & heure de départ : " + vol.dateHeureDepart + "\nDate & heure de d'arrivée : " + vol.dateHeureArrive + "\nEtat du vol : " + vol.etat);
        else
            System.out.println("Le personnel cabine " + this.nom + " ne fait pas parti de l'équipage du vol " + vol.numeroVol + ".");
    }
}
