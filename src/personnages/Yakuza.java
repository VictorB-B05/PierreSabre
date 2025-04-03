package personnages;

import personnages.*;

public class Yakuza extends Humain{
	private String Clan;
	private int Réputation = 0;
	
	
	public Yakuza(String nom, String boisson_fav, int argent, String Clan) {
		super(nom, boisson_fav, argent);
		this.Clan = Clan;
		this.Réputation = Réputation;
		// TODO Auto-generated constructor stub
	}
	
	public String getClan() {
		return Clan;
	}

	public int getRéputation() {
		return Réputation;
	}

	public void extorquer(Commerçant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int val = victime.seFaireExtorquer();
		gagnerArgent(val);
		parler("J’ai piqué les " + val + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
		Réputation += 1;
	}
	
	public int perdre() {
		int argent = getArgent();
		perdreArgent(argent);
		parler("J'ai perdu mon duel et mes " + argent + " sous, snif... J'ai déshonoré le clan " + Clan);
		Réputation -= 1;
		return argent;
	}
	
	public void gagner(int gain) {
		Réputation += 1;
		gagnerArgent(gain);
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + Clan + " ? Je l'ai dépouillé de ses " + gain + " sous.");
	}
}
