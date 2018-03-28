package TP3;

import java.util.ArrayList;

public class User {
	private String nom,prenom;
	private long id;
	private int solde;
	private ArrayList<String> listeFavoris = new ArrayList<>();
	private CarteBancaire carte;
	private Abonnement abonnement;
	
	
	public User(String nom, String prenom, long id,int solde, Abonnement abonnement, CarteBancaire carte) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
		this.solde = solde;
		this.abonnement = abonnement;
		this.carte = carte;
	}

	@Override
	public String toString() {
		return "User [nom=" + nom + ", prenom=" + prenom + ", id=" + id + ", solde=" + solde + ", listeFavoris="
				+ listeFavoris + ", carte=" + carte + ", abonnement=" + abonnement + "]";
	}

	public boolean paye(int montant) {
		if(this.solde < montant) {
			return false;
		} else {
			if(carte.paye(montant)) {
				this.setAbonnement(new Premium());
				this.solde -= montant;
			}
			return true;
		}
		
	}
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}
	
	public int getSolde() {
		return this.solde;
	}
	
	public void addTolisteFavoris(String music) {
		this.listeFavoris.add(music);
	}
	
	public void removeListeFavoris(String music) {
		this.listeFavoris.remove(music);
	}
	
	public void setAbonnement(Abonnement abonnement) {
		this.abonnement = abonnement;
	}
	
	public Abonnement getAbonnement() {
		return this.abonnement;
	}
	
	public void play(int idMusique) {
		try {
			this.abonnement.play(idMusique);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
