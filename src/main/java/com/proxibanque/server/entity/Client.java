package com.proxibanque.server.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Client extends Personne {
	
	@Embedded
	@ManyToOne
	private Conseiller conseiller;
	
	
	public Client() {
		// TODO Auto-generated constructor stub
	}


	public Client(String nom, String prenom, Adresse adresse, int telephone, Conseiller conseiller) {
		super(nom, prenom, adresse, telephone);
		
		this.conseiller = conseiller;
		// TODO Auto-generated constructor stub
	}


	public Conseiller getConseiller() {
		return conseiller;
	}


	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}


	@Override
	public String toString() {
		return "Client [conseiller=" + conseiller + "]";
	}


	
}
