public class Lieu {
    private String nom;
    
    public Lieu(){
   }
    public Lieu(String nom){
        this.nom=nom;
        System.out.println(this.nom + " est un lieu ");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
