package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		assert force > 0 : "La force d'un Romain doit être positive";
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force > 0 : "La force d'un Romain est positive"; // Précondition
		int forceInitiale = force;
		
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		
		// Postcondition : la force après avoir reçu un coup diminue
		assert force < forceInitiale : "La force d'un Romain diminue après voir reçu un coup";
	}

	public static void main(String[] args) {
		// Créer l'objet romain de la classe Romain
		Romain romain = new Romain("Minus", 6);

		// Vérification de la méthode prendreParole
		System.out.println(romain.prendreParole());

		// Vérification de la méthode parler
		romain.parler("Pour l'Empire Romain !");

		// Vérification de la méthode recevoirCoup
		romain.recevoirCoup(5);
	}
}