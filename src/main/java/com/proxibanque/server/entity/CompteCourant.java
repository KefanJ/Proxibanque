package com.proxibanque.server.entity;

import java.util.Date;

import jakarta.persistence.Entity;

@Entity
public class CompteCourant extends Compte {
	private double seuil = 1000d;
	
	public CompteCourant() {
		// TODO Auto-generated constructor stub
	}

	public CompteCourant( double solde, Date dateOuverture, double seuil) {
		super(solde, dateOuverture);
		
		this.seuil = seuil;
		// TODO Auto-generated constructor stub
	}

	public double getSeuil() {
		return seuil;
	}

	public void setSeuil(double seuil) {
		this.seuil = seuil;
	}
	
	
}
