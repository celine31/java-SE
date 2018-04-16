
public class Livre {
   String titre;
   
   public Livre(){
       
   }
   public Livre(String titre){
       this.titre=titre;
   }
   
   @Override
   public String toString(){
       return this.titre;
   }
}
