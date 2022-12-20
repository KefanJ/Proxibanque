package com.proxibanque.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proxibanque.server.entity.Client;
import com.proxibanque.server.entity.Compte;
import com.proxibanque.server.repository.ICompteCourantRepository;
import com.proxibanque.server.repository.ICompteEpargneRepository;
import com.proxibanque.server.repository.ICompteRepository;


@Service
public class CompteBancaireService implements ICompteBancaire {

	
	@Autowired
	ICompteCourantRepository compteCourantRepository;
	
	@Autowired
	ICompteEpargneRepository compteEpargneRepository;
	
	@Autowired
	ICompteRepository compteRepository;
	
	
	@Autowired
	//ClientService clientService;
	
//	@Override
//	public CompteCourant getCompteCourantById(Long id) {
//		// TODO Auto-generated method stub
//		return compteCourantRepository.findById(id).get();
//	}
//
//	@Override
//	public CompteCourant updateCompteCourant(CompteCourant compteCourant) {
//		// TODO Auto-generated method stub
//		return compteCourantRepository.save(compteCourant);
//	}
//
//	@Override
//	public CompteEpargne getCompteEpargneById(Long id) {
//		// TODO Auto-generated method stub
//		return compteEpargneRepository.findById(id).get();
//	}
//
//	@Override
//	public CompteEpargne updateCompteEpargne(CompteEpargne compteEpargne) {
//		// TODO Auto-generated method stub
//		return compteEpargneRepository.save(compteEpargne);
//	}
//
//	@Override
//	public void deleteCompteCourant(Long id) {
//		// TODO Auto-generated method stub
//		compteCourantRepository.deleteById(id);
//		//compteRepository.deleteById(id);
//	}
//
//	@Override
//	public void deleteCompteEpargne(Long id) {
//		// TODO Auto-generated method stub
//		//compteRepository.deleteById(id);
//		compteEpargneRepository.deleteById(id);
//	}
//
//	@Override
//	public CompteCourant addCompteCourant(CompteCourant compteCourant) {
//		// TODO Auto-generated method stub
//		return compteCourantRepository.save(compteCourant);
//	}
//
//	@Override
//	public CompteEpargne addCompteEpargne(CompteEpargne compteEpargne) {
//		// TODO Auto-generated method stub
//		return compteEpargneRepository.save(compteEpargne);
//	}

	@Override
	public Compte addCompte(Compte compte) {
		// TODO Auto-generated method stub
		return compteRepository.save(compte);
	}

	@Override
	public Compte geCompteById(Long id) {
		// TODO Auto-generated method stub
		return compteRepository.findById(id).get();
	}

	@Override
	public Compte updateCompte(Client client) {
		// TODO Auto-generated method stub
		
		return compteRepository.save(client.getCompte());
	}

	@Override
	public void deleteCompte(Long id) {
		// TODO Auto-generated method stub
		compteRepository.deleteById(id);
	}

}
