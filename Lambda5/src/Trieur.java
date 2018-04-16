
import java.util.List;
import java.util.ArrayList;

public class Trieur<E> {

    static <E> void trier(List<E> liste, Comparateur<E> comparateur) {
        if (liste.size() < 2) {
            return;
        }
        for (int i = 0; i < liste.size(); i++) {
            for (int j = 0; j < liste.size() - i - 1; j++) {
                E e1 = liste.get(j);
                E e2 = liste.get(j + 1);
                if (comparateur.comparer(e1, e2) > 0) {
                    liste.set(j, e2);//on change l'adresse de j et on inverse e1 en e2;
                    liste.set(j + 1, e1);//on change l'adresse de j+1 et on inverse e2 en e1;
                }
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Livre> liste = new ArrayList<>();
        liste.add(new Livre("1945"));
        liste.add(new Livre("1789"));
        liste.add(new Livre("1914"));
        liste.add(new Livre("1492"));
        System.out.println(liste);

        Trieur.trier(liste,(livre1,livre2)->livre1.titre.compareTo(livre2.titre));
           System.out.println(liste);
    }
}
