public class Robot {
 private String nom;
 private Lieu lieu;
 private static int nb=0;
 
 public Robot(){
     Robot.nb++;
       }
 public Robot(String nom){
     this();
     this.nom=nom;
    System.out.println(this.nom + " est un robot ");
 }
 public Robot(String nom, Lieu lieu){
     this(nom);
     this.lieu=lieu;
     System.out.println(this.nom + " déjà dans " + this.lieu.getNom());
 }
 
 public void allerDans(Lieu lieu){
     this.lieu=lieu;
     System.out.println(this.nom + " va dans " + lieu.getNom());
 }
public void nettoyer(){
    System.out.println(this.nom + " nettoie " + lieu.getNom());
}
public static void arreter(){
    System.out.println( " Les " + nb + " sont arrêtés");
}
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
 
}
