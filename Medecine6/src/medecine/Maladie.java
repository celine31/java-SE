package medecine;
public class Maladie {
//propriété
    private String nom;
//constructeurs
    public Maladie() {
    }
    public Maladie(String nom) {
        this.nom = nom;
        System.out.println(this.nom + " est une maladie ");
    }
//méthodes d'accès au nom
    public String getNom() {
        return this.nom;
    }
    public void setNom(String nom) {
        this.nom=nom;
    }
}
