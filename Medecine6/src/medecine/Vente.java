package medecine;

public class Vente {

    private Patient patient;
    private Medicament[] medicaments;

    public Vente() {
    }

    public Vente(Patient patient, Medicament[] medicaments) {
        this.medicaments = medicaments;
        this.patient = patient;
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

    public void setMedicaments(Medicament[] medicaments) {
        this.medicaments = medicaments;
    }
}
