package medecine;

public class Consultation {

    private Patient patient;
    private Medicament[] medicaments;
    private Maladie maladie;//pour figer la maladie après guérison

    public Consultation() {
    }

    public Consultation(Patient patient, Maladie maladie) {
        this.patient = patient;
        this.maladie = maladie;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Medicament[] getMedicaments() {
        return medicaments;
    }

    public void setMedicaments(Medicament[] medicament) {
        this.medicaments = medicament;
    }

    public Maladie getMaladie() {
        return maladie;
    }

    public void setMaladie(Maladie maladie) {
        this.maladie = maladie;
    }
    
}
