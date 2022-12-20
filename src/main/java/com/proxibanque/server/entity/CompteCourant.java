package com.proxibanque.server.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class CompteCourant extends Compte {
	private Double seuil = 1000d;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="client_id")
	@JsonIgnore
	private Client client;
	
	public CompteCourant() {
		// TODO Auto-generated constructor stub
	}

	public CompteCourant( Client client,  Double solde, LocalDate  dateOuverture, Double seuil) {
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

	public void setSeuil(Double seuil) {
		this.seuil = seuil;
	}
	
	
}
