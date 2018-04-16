
package medecine;

import java.util.ArrayList;

public class Specialiste extends Medecin{
    
    public Specialiste(){
    }
    
   public Specialiste (String prenom){
     this.setPrenom(prenom);
     System.out.println(this.getPrenom() + " est un spécilaiste");
}
    @Override
   public void recevoir(Patient patient){
        this.setPatient(patient);
        this.getConsultations().add(new ConsultationLibre(patient, patient.getMaladie()));
        System.out.println(this.getPrenom() + " recoit " + patient.getPrenom() + " en consultation");
   }
   
   public void demanderPaiement(int tarif){
       this.setTarif(tarif);
       ArrayList <Consultation> consultations=this.getConsultations();
       ((ConsultationLibre)consultations.get(consultations.size()-1)).setTarif(tarif);
       System.out.println(this.getPrenom() + " demande " + tarif + " à " + getPatient().getPrenom());
   }
}
