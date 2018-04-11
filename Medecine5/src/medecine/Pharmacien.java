package medecine;

import medecine.Medicament;
import medecine.Patient;

public class Pharmacien {

    private String prenom;

    public Pharmacien() {
    }

    public Pharmacien(String prenom) {
        this.prenom = prenom;
        System.out.println(this.prenom + " est un pharmacien ");
    }

    //méthode vendre
    public void vendre(Patient patient, Medicament medicament) {
        System.out.println(this.prenom + " vend " + medicament.getNom() + " ( " + medicament.getPrix() + "euros) à " + patient.getPrenom());
    }

    public void vendre(Patient patient, Medicament... medicaments) {
        StringBuilder sbMedicaments = new StringBuilder(); //Stringbuilder plutôt que Strin car la capacité évolue
        for (Medicament medicament : medicaments) {
            sbMedicaments.append(", ")
                         .append(medicament.getNom())
                         .append(" ( ")
                         .append(medicament.getPrix())
                         .append(" euros) ");
        }
        sbMedicaments.delete(0, 2);
        System.out.println(this.prenom + " vend " + sbMedicaments + "à " + patient.getPrenom());
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
