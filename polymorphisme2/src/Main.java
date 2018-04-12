
public class Main {

    public static void main(String[] args) {
        Usine u = new Usine();
        for (int i = 0; i < 10; i++) {
          Stylo stylo = u.fabriquer();
          if(stylo instanceof StyloBille){
              ((StyloBille)stylo).fuir();
          }
          else if(stylo instanceof StyloPlume){
              ((StyloPlume)stylo).recharger();
          }
          else stylo.ecrire();
        }
    }

}
