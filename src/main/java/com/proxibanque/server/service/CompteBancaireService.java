package com.proxibanque.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proxibanque.server.entity.CompteCourant;
import com.proxibanque.server.entity.CompteEpargne;
import com.proxibanque.server.repository.ICompteCourantRepository;
import com.proxibanque.server.repository.ICompteEpargneRepository;


@Service
public class CompteBancaireService implements ICompteBancaire {

	
	@Autowired
	ICompteCourantRepository compteCourantRepository;
	
	@Autowired
	ICompteEpargneRepository compteCourCompteEpargneRepository;
	
	@Override
	public CompteCourant getCompteCourantById(Long id) {
		// TODO Auto-generated method stub
		return compteCourantRepository.findById(id).get();
	}

	@Override
	public CompteCourant updateCompteCourant(CompteCourant compteCourant) {
		// TODO Auto-generated method stub
		return compteCourantRepository.save(compteCourant);
	}

	@Override
	public CompteEpargne getCompteEpargneById(Long id) {
		// TODO Auto-generated method stub
		return compteCourCompteEpargneRepository.findById(id).get();
	}

	@Override
	public CompteEpargne updateCompteEpargne(CompteEpargne compteEpargne) {
		// TODO Auto-generated method stub
		return compteCourCompteEpargneRepository.save(compteEpargne);
	}

}
