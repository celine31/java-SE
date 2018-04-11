package medecine;
public class Medicament {

    private String nom;
    private int prix;

    public Medicament() {
    }

    public Medicament(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
        System.out.println(this.nom + " est un médicament à " + this.prix + " euros");
    }

     protected static int total(Medicament[] medicaments) {
        int total = 0; 
        for (Medicament medicament : medicaments) {
            total += medicament.getPrix();
        }
        return total;
    }
     
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
    
}
