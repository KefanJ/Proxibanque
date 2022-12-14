package com.proxibanque.server.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Client extends Personne {
	
	
	@ManyToOne
	private Conseiller conseiller;
	
	@Embedded
	private CompteCourant compteCourant;
	
	@Embedded
	private CompteEpargne compteEpargne;
	
	@Embedded
	private Adresse adresse;
	
	public Client() {
		// TODO Auto-generated constructor stub
	}


	public Client(String nom, String prenom, Adresse adresse, String telephone, Conseiller conseiller, CompteCourant compteCourant,  CompteEpargne compteEpargne ) {
		super(nom, prenom, telephone);
		
		this.conseiller = conseiller;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
		this.adresse =adresse;
		// TODO Auto-generated constructor stub
	}


	public Adresse getAdresse() {
		return adresse;
	}


	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}


	public Conseiller getConseiller() {
		return conseiller;
	}


	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}


	public CompteCourant getCompteCourant() {
		return compteCourant;
	}


	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}


	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}


	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}


	@Override
	public String toString() {
		return "Client [conseiller=" + conseiller + "]";
	}


	
}
