
public class Main {

    public static void main(String[] args) {
        Usine u = new Usine();
        for (int i = 0; i < 10; i++) {
            u.fabriquer().ecrire();
        }
    }

}
