package personnages;

import personnages.*;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boisson_fav, int argent) {
		super(nom, boisson_fav, argent);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public void donner(Commerçant beneficiaire) {
		int don = getArgent() / 10;
		parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
		perdreArgent(don);
		beneficiaire.recevoir(don);
	}
}


