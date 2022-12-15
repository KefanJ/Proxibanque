package com.proxibanque.server.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;

@Entity
public class CompteEpargne extends Compte {
	private double taux =3d;
	
	
	@OneToOne
	//@MapsId
	private Client client;
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public CompteEpargne() {
		// TODO Auto-generated constructor stub
	}

	public CompteEpargne(Client client, double solde, Date dateOuverture, double taux) {
		super(solde, dateOuverture);
		// TODO Auto-generated constructor stub
		this.taux = taux;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	
}
