package main;

import medecine.*;


public class Medecine{
	
	public static void main(String[] args) {
		Patient gilles = new Patient("Gilles");
		Maladie grippe = new Maladie("grippe");
		gilles.contracter(grippe);
		Generaliste greg = new Generaliste("Greg", 23);
		greg.recevoir(gilles);
		Medicament aspirine = new Medicament("aspirine", 10);
		Medicament paracetamol = new Medicament("paracetamol", 7);
		greg.prescrire(aspirine, paracetamol);
		greg.demanderPaiement();
		gilles.payer(greg);
		Patient robert = new Patient("Robert");
		Maladie rhinite = new Maladie("rhinite");
		robert.contracter(rhinite);
		greg.recevoir(robert);
		greg.prescrire(aspirine);
		Specialiste sam = new Specialiste("Sam");
		greg.envoyerPatient(sam);
		greg.demanderPaiement();
		robert.payer(greg);
		Pharmacien paul = new Pharmacien("Paul");
		paul.vendre(gilles, aspirine, paracetamol);
		gilles.payer(paul, aspirine, paracetamol);
		gilles.guerir();
		paul.vendre(robert, aspirine);
		robert.payer(paul, aspirine);
		sam.recevoir(robert);
		Medicament oxymetazoline = new Medicament("oxymetazoline", 18);
		sam.prescrire(oxymetazoline);
		sam.demanderPaiement(60);
		robert.payer(sam);
		paul.vendre(robert, oxymetazoline);
		robert.payer(paul, oxymetazoline);
		robert.guerir();
		greg.afficherConsultations();
		sam.afficherConsultations();
		paul.afficherVentes();
	}
}


