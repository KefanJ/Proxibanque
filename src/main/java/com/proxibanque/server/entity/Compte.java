package com.proxibanque.server.entity;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Compte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int numCompte;
	
	private double solde;
	@CreatedDate
	private Date dateOuverture = new Date();
	
	public Compte() {
		// TODO Auto-generated constructor stub
	}

	public Compte(double solde, Date dateOuverture) {
		super();

		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}

	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Date getDateOuverture() {
	
		
		return dateOuverture;
	}

	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	@Override
	public String toString() {
		return "Compte [numCompte=" + numCompte + ", solde=" + solde + ", dateOuverture=" + dateOuverture + "]";
	}
	
	

}