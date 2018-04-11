package main;

import biblio.Bibliotheque;

public class Appli {

	public static void main(String[] args) {
		Bibliotheque biblio = new Bibliotheque();
		boolean ok;
		ok = biblio.ajouterLivre("bible");
		System.out.println(ok); // true
		/*ok = biblio.ajouterLivre("bible");
		System.out.println(ok); // false (doublon de référence)
		ok = biblio.ajouterLecteur("bob");
		System.out.println(ok); // true
		ok = biblio.ajouterLecteur("bob");
		System.out.println(ok); // false (doublon d'identifiant)
		ok = biblio.emprunter("max", "bible");
		System.out.println(ok); // false (identifiant inconnu)
		ok = biblio.emprunter("bob", "coran");
		System.out.println(ok); // false (référence inconnue)
		ok = biblio.emprunter("bob", "bible");
		System.out.println(ok); // true
		ok = biblio.emprunter("bob", "bible");
		System.out.println(ok); // false (référence déjà empruntée)
		ok = biblio.rendre("bible");
		System.out.println(ok); // true
		ok = biblio.rendre("bible");
		System.out.println(ok); // false (emprunt inconnu)*/
	}
}