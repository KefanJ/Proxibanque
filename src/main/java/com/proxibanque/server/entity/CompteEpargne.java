package com.proxibanque.server.entity;

import java.util.Date;

import jakarta.persistence.Entity;

@Entity
public class CompteEpargne extends Compte {
	private double taux =3d;
	
	public CompteEpargne() {
		// TODO Auto-generated constructor stub
	}

	public CompteEpargne(double solde, Date dateOuverture, double taux) {
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
