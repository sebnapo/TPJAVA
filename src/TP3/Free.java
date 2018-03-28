package TP3;

public class Free implements Abonnement {
	private int nbLecture;
	private int nbLectureMax = 3;
	private BanqueMusique banque = new BanqueMusique();
	
	public Free() {
		this.nbLecture = 0;
	}
	public void play(int idMusic) throws Exception {
		if(this.nbLecture < 4) {
			
			System.out.println("Je joue la music "+banque.getFile(idMusic)+" trop cool");
		} else {
			throw new Exception("Plus de musique dispo aujourd'hui...");
		}
	}
	
	public void setnbLectureMax(int nb) {
		this.nbLectureMax = nb;
	}
	public void reset() {
		this.nbLecture =0;
	}
}
