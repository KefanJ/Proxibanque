package com.proxibanque.server.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Conseiller extends Personne {
	
	@OneToMany(mappedBy = "conseiller", cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	private Set<Client> clients = new HashSet<>();
	
	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	private Gerant gerant;
	
	
	
	public Set<Client> getClients() {
		return clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

	public Conseiller() {
		// TODO Auto-generated constructor stub
	}

	public Conseiller( String nom, String prenom, String  telephone) {
		super(nom, prenom, telephone);
		// TODO Auto-generated constructor stub
	}
	
}
