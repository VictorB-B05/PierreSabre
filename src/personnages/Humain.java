package personnages;

public class Humain {
	private String nom;
	private String boisson_fav;
	private int argent;
	
	public Humain(String nom, String boisson_fav, int argent) {
		this.nom = nom;
		this.boisson_fav = boisson_fav;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	private void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson_fav);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boisson_fav + " ! GLOUPS !");
	}
	
	public void gagnerArgent(int val) {
		this.argent = this.argent + val;
	}
	
	public void perdreArgent(int val) {
		this.argent = this.argent - val;
	}
	
	public void acheter(String objet, int prix) {
		if (this.argent >= prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un(e) " + objet + " à " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un(e) " + objet + " à " + prix + " sous.");
		}
	}
}
