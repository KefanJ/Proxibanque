package com.proxibanque.server.service;

import com.proxibanque.server.entity.CompteCourant;
import com.proxibanque.server.entity.CompteEpargne;

public interface ICompteBancaire {
	

	public CompteCourant getCompteCourantById(Long id);
	public CompteCourant updateCompteCourant(CompteCourant compteCourant);
	public CompteEpargne getCompteEpargneById(Long id);
	public CompteEpargne updateCompteEpargne(CompteEpargne compteEpargne);
	
	
	
}
