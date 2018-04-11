package biblio;

class Emprunt {

    private Lecteur lecteur;
    private Livre livre;

    public Emprunt() {
    }

    public Emprunt(Lecteur lecteur, Livre livre){
        this.lecteur=lecteur;
        this.livre=livre;
    }
    
    public boolean equals(Object obj) {
        if (obj instanceof Emprunt) {
            return ((Emprunt) obj).lecteur.equals(this.lecteur) && ((Emprunt) obj).livre.equals(this.livre);
        }
        return false;
    }

    public Lecteur getLecteur() {
        return lecteur;
    }

    public void setLecteur(Lecteur lecteur) {
        this.lecteur = lecteur;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

}
