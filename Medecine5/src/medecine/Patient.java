package medecine;

import medecine.Medecin;
import medecine.Maladie;

public class Patient {

    //propriété  
    private String prenom;
    private Maladie maladie;

    //constructeur 
    public Patient() {
    }

    public Patient(String prenom) {
        this.prenom = prenom;
        System.out.println(this.prenom + " est un patient");
    }

    //méthode d'accès aux propriétés
    public String getPrenom() {
        return prenom;
    }

    public void SetPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Maladie getMaladie() {
        return maladie;
    }

    public void SetMaladie(Maladie maladie) {
        this.maladie = maladie;
    }

    //méthode contracter
    public void contracter(Maladie maladie) {
        this.maladie = maladie;
        System.out.println(this.prenom + " contracte la maladie " + this.maladie.getNom());
    }

    //méthodes payer
    public void payer(Medecin medecin) {
        System.out.println(this.prenom + " paie " + medecin.getTarif() + " euros à " + medecin.getPrenom());
    }

    public void payer(Pharmacien pharmacien, Medicament medicament) {
        System.out.println(this.prenom + " paie " + medicament.getPrix() + " euros à " + pharmacien.getPrenom());
    }

    public void payer(Pharmacien pharmacien, Medicament... medicaments) {
        int total = 0; //Stringbuilder plutôt que String car la capacité évolue
        for (Medicament medicament : medicaments) {
             total += medicament.getPrix();
        }
            System.out.println(this.prenom + " paie " + total + " euros à " + pharmacien.getPrenom());
     }

    //méthode guérir
    public void guerir() {
        System.out.println(this.prenom + " guérit de la maladie " + this.maladie.getNom());
        this.maladie = null;
        //  System.out.println(this.prenom + " guérrit à la maladie " + this.maladie.getNom())  => erreur à la compilation;
    }
}
