package medecine;

public class Generaliste extends Medecin {

    public Generaliste() {
    }

    public Generaliste(String prenom, int tarif) {
        super(prenom, tarif);
        System.out.println(prenom + " est un généraliste (tarif :)" + tarif + " euros ");
    }

    public void envoyerPatient(Specialiste specialiste) {
        System.out.println(getPrenom() + " envoie " + getPatient().getPrenom() + " chez " + specialiste.getPrenom());
    }

}
