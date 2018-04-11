package medecine;

import java.util.ArrayList;

public class Medecin {

    private String prenom;
    private int tarif;
    private Patient patient;
    private final ArrayList<Consultation> consultations = new ArrayList<>();

    public Medecin() {
    }

    public Medecin(String prenom, int tarif) {
        this.prenom = prenom;
        this.tarif = tarif;
        System.out.println(this.prenom + " est un médecin (tarif: " + this.tarif + " euros )");
    }

    public void recevoir(Patient patient) {
        this.patient = patient;
        this.consultations.add(new Consultation(this.patient, this.patient.getMaladie()));
        System.out.println(this.prenom + " recoit " + this.patient.getPrenom() + " en consultation");
    }

    public void demanderPaiement() {
        System.out.println(this.prenom + " demande " + this.tarif + " euros à " + this.patient.getPrenom());
    }

    public void prescrire(Medicament medicament) {
        System.out.println(this.prenom + " prescrit " + medicament.getNom() + " à " + this.patient.getPrenom());
    }

    public void prescrire(Medicament... medicaments) {
        this.consultations.get(this.consultations.size() - 1).setMedicaments(medicaments);
        StringBuilder sbMedicaments = new StringBuilder(); //Stringbuilder plutôt que Strin car la capacité évolue
        for (Medicament medicament : medicaments) {
            sbMedicaments.append(", ").append(medicament.getNom());
        }
        sbMedicaments.delete(0, 2);//méthode de stringbuffer ou avec stringbulder.substring mais il faut retenir dans une variable
        System.out.println(this.prenom + "prescrit " + sbMedicaments + " à " + this.patient.getPrenom());
    }

    public void afficherConsultations() {
        System.out.println("Consultations de " + this.prenom + " : ");
        for(Consultation consultation : this.consultations) {
             System.out.println("\t" + consultation.getMaladie().getNom() + ")");
            for (Medicament medicament : consultation.getMedicaments()) {
                System.out.println("\t\t" + medicament.getNom()); //System.getProperty("line.separator";permet de faire une retour à la ligne portatif
            }
        }
        System.out.println("Total : " + this.consultations.size() + "consultations");
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

}
