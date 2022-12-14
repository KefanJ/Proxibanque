package com.proxibanque.server.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Personne {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nom;
	private String prenom;
	
	private String telephone;
	
	public Personne() {
		// TODO Auto-generated constructor stub
	}
	


	public Personne(String nom, String prenom, String telephone) {
		super();
		
		this.nom = nom;
		this.prenom = prenom;
		
		this.telephone = telephone;
	}


	public Long  getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	

	public String  getTelephone() {
		return telephone;
	}

	public void setTelephone(String  telephone) {
		this.telephone = telephone;
	}
	
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", telephone="
				+ telephone + "]";
	}

}
