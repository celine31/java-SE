package medecine;

import java.util.ArrayList;

public class Pharmacien {

    private String prenom;
    private final ArrayList<Vente> ventes=new ArrayList<>();
    
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
        this.ventes.add(new Vente(patient,medicaments));
        StringBuilder sbMedicaments = new StringBuilder(); //Stringbuilder plutôt que String car la capacité évolue
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

    public void afficherVentes(){
      int grandTotal=0;
      System.out.println("Ventes de " +this.prenom+" : ");
      for(Vente vente:ventes){
          Medicament[] medicaments=vente.getMedicaments();
          System.out.println("\t" + vente.getPatient().getPrenom());
          for(Medicament medicament : vente.getMedicaments()){
              System.out.println(" \t\t "+medicament.getNom() +" (" + medicament.getPrix()+")");
          }
          int sousTotal= Medicament.total(medicaments);
          System.out.println("\tSous-total : "+ sousTotal);
          grandTotal +=sousTotal;
      }
     System.out.println("Grand total :"+grandTotal+" euros");
    }
    
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
