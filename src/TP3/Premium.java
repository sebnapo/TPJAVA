package TP3;

public class Premium implements Abonnement {
	
	private int tarif = 10;
	
	public Premium() {
		
	}
	public void play(int idMusique) {
		System.out.println("youpi je joue la musique " +idMusique);
	}
	
	public void setTarif(int tarif) {
		this.tarif = tarif;
	}
	
	public int getTarif() {
		return this.tarif;
	}
}
