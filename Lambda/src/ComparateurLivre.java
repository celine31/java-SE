
public class ComparateurLivre implements Comparateur<Livre>{

    @Override
    public int comparer(Livre livre1, Livre livre2) {
        return livre1.titre.compareTo(livre2.titre);
    }

 
}
