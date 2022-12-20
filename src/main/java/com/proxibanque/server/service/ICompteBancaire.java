package com.proxibanque.server.service;

import com.proxibanque.server.entity.Compte;

public interface ICompteBancaire {
	
	
	
	
	public Compte addCompte(Compte compte);
	public Compte geCompteById(Long id);
	public Compte updateCompte(Compte compte);
	public void deleteCompte(Long id);
	
	
//	public CompteCourant addCompteCourant(CompteCourant compteCourant);
//	public CompteCourant getCompteCourantById(Long id);
//	public CompteCourant updateCompteCourant(CompteCourant compteCourant);
//	public void deleteCompteCourant(Long id);
//	
//	public CompteEpargne addCompteEpargne(CompteEpargne compteEpargne);
//	public CompteEpargne getCompteEpargneById(Long id);
//	public CompteEpargne updateCompteEpargne(CompteEpargne compteEpargne);
//	public void deleteCompteEpargne(Long id);
//	
//	
	
}
