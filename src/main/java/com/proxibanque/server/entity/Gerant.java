package com.proxibanque.server.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Gerant extends Personne{
	
	@OneToOne
	Agence agence;
	
	@OneToMany(mappedBy = "gerant")
	Set<Conseiller>conseillers = new HashSet<>();
	
	
	
	public Gerant() {
		// TODO Auto-generated constructor stub
	}

	public Gerant( String nom, String prenom, Adresse adresse, int telephone) {
		super(nom, prenom, adresse, telephone);
		// TODO Auto-generated constructor stub
	}
	
}
