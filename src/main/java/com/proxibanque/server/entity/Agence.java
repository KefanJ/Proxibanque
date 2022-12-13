package com.proxibanque.server.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Agence {
	Long identifiant;
	Date dateCreation;
	
	@OneToOne(mappedBy = "agence")
	Gerant gerant;
	
	public Agence() {
		// TODO Auto-generated constructor stub
	}

	
	public Agence(Long identifiant, Date dateCreation, Gerant gerant) {
		super();
		this.identifiant = identifiant;
		this.dateCreation = dateCreation;
		this.gerant = gerant;
	}


	public Long getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(Long identifiant) {
		this.identifiant = identifiant;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	public Gerant getGerant() {
		return gerant;
	}


	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}


	@Override
	public String toString() {
		return "Agence [identifiant=" + identifiant + ", dateCreation=" + dateCreation + "]";
	}
	
	

}
