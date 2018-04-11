package biblio;

class Livre {

    private String ref;

    public Livre() {
    }

    public Livre(String ref) {
        this.ref = ref;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Livre) {                 //on vérifie que c'est une instance de Livre
            return ((Livre) obj).ref.equals(this.ref); //on caste l'objet en Livre, on l'encapsule car le point de ref serait prioritaire
        }                                           //on utilise la méthode equals de String pour comparer sinon == compare les adresses uniquement
        return false;                               //on peut utiliser un if mais il est inutile car equals renvoi déjà un boolean donc on retourne directement le résultat de equals()
    }
    //on peut faire en une ligne avec le short operator && : return obj instanceof Livre && ((Livre)obj).ref.equals(this.ref);

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

}
