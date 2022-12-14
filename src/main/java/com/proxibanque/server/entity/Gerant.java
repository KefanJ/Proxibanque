package com.proxibanque.server.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Gerant extends Personne{
	
//	@OneToOne(mappedBy = "gerant")
//	private Agence agence;
	
	@OneToMany
	private Set<Conseiller>conseillers = new HashSet<>();
	
	
	
	public Gerant() {
		// TODO Auto-generated constructor stub
	}

	public Gerant( String nom, String prenom, String telephone) {
		super(nom, prenom, telephone);
		// TODO Auto-generated constructor stub
	}
	
}
