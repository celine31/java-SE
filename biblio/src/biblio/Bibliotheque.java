/*
 Elle doit servir de passerelle
on ne peut emprunter un livre directement depuis main
 */
package biblio;

import java.util.ArrayList;


public class Bibliotheque {

    private final ArrayList<Lecteur> lecteurs = new ArrayList<>();
    private final ArrayList<Livre> livres = new ArrayList<>();
    private final ArrayList<Emprunt> emprunts = new ArrayList<>();

    public Bibliotheque() {
    }

    public boolean ajouterLecteur(String id) {
        Lecteur lecteur = new Lecteur(id);//on crée un nouveau 
        return this.lecteurs.contains(lecteur) ? false : this.lecteurs.add(lecteur);// add retourne toujous true
    }//return !this.lecteurs.contains(lecteur)&& this.lecteurs.add(lecteur);
    // si false on retourne false, si vrai on fait la suite this.lecteurs.add(lecteur)

    public boolean ajouterLivre(String ref) {
        Livre livre = new Livre(ref);
        return this.livres.contains(livre) ? false : this.livres.add(livre);
    }

    public boolean emprunter(String id, String ref) {
        Lecteur lecteur=new Lecteur(id);
        Livre livre = new Livre(ref);
        return !this.lecteurs.contains(lecteur) 
                && !this.livres.contains(livre)
                && !this.estDispo(livre)
                && this.emprunts.add(new Emprunt(lecteur, livre));
    }  

    public boolean rendre(String ref) {
        Livre livre=new Livre(ref);
        return !this.livres.contains(livre)
                && !this.estDispo(livre)
                &&
    }
  
    private boolean estDispo(Livre livre){
        for(Emprunt emprunt:this.emprunts){
            if (emprunt.getLivre().equals(livre)) return false;
        }
    return true;
    }

    }
