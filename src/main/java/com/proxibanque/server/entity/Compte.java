package com.proxibanque.server.entity;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Component

public class Compte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numCompte;
	
	private Double solde = 100d;
	
	private LocalDate dateOuverture = LocalDate.now();
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="client_id")
	@JsonIgnore
	private Client client;
	

	public Compte() {
		// TODO Auto-generated constructor stub
	}

	public Compte(Double solde, LocalDate  dateOuverture) {
		super();

		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}
	public Compte(Double solde, LocalDate  dateOuverture, Client client) {
		super();

		this.solde = solde;
		this.dateOuverture = dateOuverture;
		this.client = client;
	}


	
	public Compte(Client client) {
		this.client = client;
	}
	
	public Long getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(Long numCompte) {
		this.numCompte = numCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	public LocalDate  getDateOuverture() {
	
		
		return dateOuverture;
	}

	public void setDateOuverture(LocalDate  dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}


	@Override
	public String toString() {
		return "Compte [numCompte=" + numCompte + ", solde=" + solde + ", dateOuverture=" + dateOuverture + "]";
	}
	
	

}
