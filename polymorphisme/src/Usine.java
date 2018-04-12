
public class Usine {

    public Usine() {
    }

    public Stylo fabriquer() {
        int i = (int) (Math.random() * 3);
        if (i == 0) {
            return new Stylo();
        }
        if (i == 1) {
            return new StyloBille();
        }
        return new StyloPlume();
    }
}
