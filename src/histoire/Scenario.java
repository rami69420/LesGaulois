package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {
	public static void main(String[] args) {
		Druide panoramix = new Druide("Le druide Panoramix", 5, 10);
		panoramix.parler("Bonjour, je suis le druide Panoramix et ma potion peut aller d'une force 5 à 10.");

		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion(); // Supposons que cette préparation donne une potion de force 6

		Gaulois obelix = new Gaulois("Le gaulois Obélix", 25);
		panoramix.booster(obelix);

		Gaulois asterix = new Gaulois("Le gaulois Astérix", 8);
		panoramix.booster(asterix);

		Romain minus = new Romain("Le romain Minus", 6);

		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");

		asterix.frapper(minus);
		minus.parler("j'abandonne...");
	}
}
