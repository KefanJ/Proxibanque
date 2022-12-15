package com.proxibanque.server.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class CompteCourant extends Compte {
	private double seuil = 1000d;
	
	@OneToOne
	//@MapsId
	private Client client;
	
	public CompteCourant() {
		// TODO Auto-generated constructor stub
	}

	public CompteCourant( Client client,  double solde, Date dateOuverture, double seuil) {
		super(solde, dateOuverture);
		this.seuil = seuil;
		this.client = client;
		// TODO Auto-generated constructor stub
	}
	
	public CompteCourant(Client client) {
		this.client = client;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public double getSeuil() {
		return seuil;
	}

	public void setSeuil(double seuil) {
		this.seuil = seuil;
	}
	
	
}
