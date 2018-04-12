
import java.util.ArrayList;

public class Liste<T> {

    ArrayList<T> items = new ArrayList<>();

    public Liste() {
    }

    public void ajouter(T item) {
        this.items.add(item);
    }

    @Override
    public String toString() {
        return this.items.toString();
    }

    public static void main(String[] args) {
        Liste<String> liste1 = new Liste<>();
        liste1.ajouter("Toto");
        liste1.ajouter("Lulu");
        System.out.println(liste1); // [Toto, Lulu]//println appelle toString donc il faut la redefinir
        Liste<Integer> liste2 = new Liste<>();
        liste2.ajouter(123);
        liste2.ajouter(456);
        System.out.println(liste2); // [123, 456]
    }
}
