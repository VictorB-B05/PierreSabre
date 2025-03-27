package histoire;

import personnages.*;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		
		Commerçant marco = new Commerçant("Marco", "thé", 20);
		
		Yakuza yaku_le_noir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 52);
		
		System.out.println("\n");
		
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		System.out.println("\n");
		
		yaku_le_noir.direBonjour();
		yaku_le_noir.extorquer(marco);
		
		
	}
}
