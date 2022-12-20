package com.proxibanque.server.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class CompteEpargne extends Compte {
	
	private Double taux =3d;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="client_id")
	@JsonIgnore
	private Client client;
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public CompteEpargne() {
		// TODO Auto-generated constructor stub
	}

	public CompteEpargne(Client client, Double solde, LocalDate  dateOuverture, Double taux) {
		super(solde, dateOuverture);
		// TODO Auto-generated constructor stub
		this.taux = taux;
	}
	
	public CompteEpargne(Client client) {
		this.client = client;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(Double  taux) {
		this.taux = taux;
	}
	
	
}
