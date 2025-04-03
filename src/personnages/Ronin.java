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
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		if (honneur*2 >= adversaire.getRéputation()) {
			parler("Je t'ai eu petit Yakuza !");
			gagnerArgent(adversaire.perdre());
			honneur += 1;
		}
		else {
			parler("J'ai perdu contre ce yakuza, mon honner et ma bourse ont en pris un coup.");
			adversaire.gagner(getArgent());
			perdreArgent(getArgent());
			honneur -= 1;
		}
	}
}


