package exemplesPOO;

public class Voiture {
	String marque ;
	String modèle ;
	int année ;
	int portes ;
	public void avancer() {
		System.out.println("La " +marque+ " avance!");
	}
	
	public Voiture(String marque, String modèle, int année, int portes) {
		this.marque = marque;
		this.modèle = modèle;
		this.année = année;
		this.portes = portes;
	}
}
