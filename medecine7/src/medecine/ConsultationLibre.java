package medecine;

public class ConsultationLibre extends Consultation {

    private int tarif;

    public ConsultationLibre() {

    }

    public ConsultationLibre(Patient patient, Maladie maladie) {
        super(patient,maladie);
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }
    
}
