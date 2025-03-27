package personnages;

public class Commerçant extends Humain{

	public Commerçant(String nom, String boisson_fav, int argent) {
		super(nom, boisson_fav, argent);
		// TODO Auto-generated constructor stub
	}
	
	public int seFaireExtorquer() {
		int val = getArgent();
		parler("J’ai tout perdu! Le monde est trop injuste...");
		perdreArgent(getArgent());
		return val;
	}
	
	public void recevoir(int argent) {
		parler(argent + " sous ! Je te remercie généreux donateur!");
		gagnerArgent(argent);
	}
}
