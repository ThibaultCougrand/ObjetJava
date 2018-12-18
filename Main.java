package exemplesPOO;

public class Main {

	public static void main(String[] args) {
		Avion un = new Avion();//on instancie un avion.
		un.voler();//on lui applique sa méthode
		un = null;//on le détruit.
		un.voler();//on peut plus l'utiliser.
		Voiture une = new Voiture("peugeot", "205", 1990, 5);
		une.avancer();
	}

}
