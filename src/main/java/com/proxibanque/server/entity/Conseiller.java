package com.proxibanque.server.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Conseiller extends Personne {
	
	@OneToMany(mappedBy = "conseiller")
	private Set<Client> clients = new HashSet<>();
	
	@ManyToOne
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

	public Conseiller(int id, String nom, String prenom, Adresse adresse, int telephone) {
		super(nom, prenom, adresse, telephone);
		// TODO Auto-generated constructor stub
	}
	
}
