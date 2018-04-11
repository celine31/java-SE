package main;

import medecine.Pharmacien;
import medecine.Medicament;
import medecine.Patient;
import medecine.Medecin;
import medecine.Maladie;


public class Medecine {

	public static void main(String[] args) {
		Patient gilles = new Patient("Gilles");
		Maladie grippe = new Maladie("grippe");
		gilles.contracter(grippe);
		Medecin marc = new Medecin("Marc", 23);
		marc.recevoir(gilles);
		Medicament aspirine = new Medicament("aspirine", 10);
		Medicament paracetamol = new Medicament("paracetamol", 7);
		marc.prescrire(aspirine, paracetamol);
		marc.demanderPaiement();
		gilles.payer(marc);
		Pharmacien paul = new Pharmacien("Paul");
		paul.vendre(gilles, aspirine, paracetamol);
		gilles.payer(paul, aspirine, paracetamol);
		gilles.guerir();
	}
}


