package com.proxibanque.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proxibanque.server.entity.Client;
import com.proxibanque.server.entity.Compte;
import com.proxibanque.server.repository.IClientRepository;
import com.proxibanque.server.repository.ICompteCourantRepository;
import com.proxibanque.server.repository.ICompteEpargneRepository;

@Service
public class ClientService implements IClientService {
	
	@Autowired
	IClientRepository repository;
	
//	@Autowired
//	CompteBancaireService compteBancaireService;
	
	@Autowired
	ICompteCourantRepository compteCourantRepository;
	
	@Autowired
	ICompteEpargneRepository compteEpargneRepository;
	
	@Autowired
	CompteBancaireService compteService;
	

	@Override
	public Client addClient(Client client) {
//		CompteCourant compteCourant = new CompteCourant(client);
//		CompteEpargne compteEpargne = new CompteEpargne(client);
//		client.setCompteCourant(compteCourant);
//		client.setCompteEpargne(compteEpargne);
//		compteService.addCompteCourant(compteCourant);
//		compteService.addCompteEpargne(compteEpargne);
		Compte compte = new Compte(client);
		client.setCompte(compte);
		compteService.addCompte(compte);
		repository.save(client);
		return client;
	}

	@Override
	public List<Client> getClients() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Client updateClient(Client client) {
		// TODO Auto-generated method stub
		
//		CompteCourant compteCourant = compteService.getCompteCourantById(client.getCompteCourant().getNumCompte());
//		CompteEpargne compteEpargne = compteService.getCompteEpargneById(client.getCompteEpargne().getNumCompte());
//		client.setCompteCourant(compteCourant);
//		client.setCompteEpargne(compteEpargne);
//		compteService.updateCompteCourant(compteCourant);
//		compteService.updateCompteEpargne(compteEpargne);
		//Compte compte = compteService.geCompteById(client.getCompte().getNumCompte());
		//client.setCompte(compte);
		compteService.updateCompte(client.getCompte());
		
		
		repository.save(client);
		
		//System.out.println(client.getCompteCourant().getSolde());
		return client;
	}

	@Override
	public void deleteClient(Long id) {
		
		//CompteCourant compteCourant = compteCourantRepository.findById(client.getCompteCourant().getNumCompte()).get();
		//CompteEpargne compteEpargne = compteEpargneRepository.findById(client.getCompteEpargne().getNumCompte()).get();
//		Client client = repository.findById(id).get();
//		CompteCourant courant = compteService.getCompteCourantById(client.getCompteCourant().getNumCompte());
//		CompteEpargne epargne = compteService.getCompteEpargneById(client.getCompteEpargne().getNumCompte());
//		compteService.deleteCompteCourant(courant.getNumCompte());
//		compteService.deleteCompteCourant(epargne.getNumCompte());
//		System.out.println(courant);
//		System.out.println(epargne);
		//Client client = repository.findById(id).get();
		//compteService.deleteCompte(client.getCompte().getNumCompte());
		repository.deleteById(id);
	}

	@Override
	public Client getClientById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

//	@Override
//	public CompteCourant addCompteCourant(CompteCourant compteCourant) {
//		// TODO Auto-generated method stub
//		
//		return compteCourantRepository.save(compteCourant);
//		
//		
//	}
//
//	@Override
//	public CompteEpargne addCompteEpargne(CompteEpargne compteEpargne) {
//		// TODO Auto-generated method stub
//		return compteEpargneRepository.save(compteEpargne);
//	}
//
//	@Override
//	public CompteCourant updateCompteCourant(CompteCourant compteCourant) {
//		// TODO Auto-generated method stub
//		
//		return compteCourantRepository.save(compteCourant);
//	}
//
//	@Override
//	public CompteEpargne updateCompteEpargne(CompteEpargne compteEpargne) {
//		// TODO Auto-generated method stub
//		return compteEpargneRepository.save(compteEpargne);
//	}
//
//	@Override
//	public CompteCourant getCompteCourantById(Long id) {
//		// TODO Auto-generated method stub
//		
//		return compteCourantRepository.findById(id).get();
//	}
//
//	@Override
//	public CompteEpargne getCompteEpargneById(Long id) {
//		// TODO Auto-generated method stub
//		return compteEpargneRepository.findById(id).get();
//	}


}
