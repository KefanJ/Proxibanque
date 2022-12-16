package com.proxibanque.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proxibanque.server.entity.Client;
import com.proxibanque.server.entity.CompteCourant;
import com.proxibanque.server.entity.CompteEpargne;
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
	

	@Override
	public Client addClient(Client client) {
		CompteCourant compteCourant = new CompteCourant(client);
		CompteEpargne compteEpargne = new CompteEpargne(client);
		client.setCompteCourant(compteCourant);
		client.setCompteEpargne(compteEpargne);
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
		
		CompteCourant compteCourant = getCompteCourantById(client.getCompteCourant().getNumCompte());
		CompteEpargne compteEpargne = getCompteEpargneById(client.getCompteEpargne().getNumCompte());
		client.setCompteCourant(compteCourant);
		client.setCompteEpargne(compteEpargne);
		updateCompteCourant(compteCourant);
		updateCompteEpargne(compteEpargne);
		repository.save(client);
		
		//System.out.println(client.getCompteCourant().getSolde());
		return client;
	}

	@Override
	public void deleteClient(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public CompteCourant addCompteCourant(CompteCourant compteCourant) {
		// TODO Auto-generated method stub
		
		return compteCourantRepository.save(compteCourant);
		
		
	}

	@Override
	public CompteEpargne addCompteEpargne(CompteEpargne compteEpargne) {
		// TODO Auto-generated method stub
		return compteEpargneRepository.save(compteEpargne);
	}

	@Override
	public CompteCourant updateCompteCourant(CompteCourant compteCourant) {
		// TODO Auto-generated method stub
		
		return compteCourantRepository.save(compteCourant);
	}

	@Override
	public CompteEpargne updateCompteEpargne(CompteEpargne compteEpargne) {
		// TODO Auto-generated method stub
		return compteEpargneRepository.save(compteEpargne);
	}

	@Override
	public CompteCourant getCompteCourantById(Long id) {
		// TODO Auto-generated method stub
		
		return compteCourantRepository.findById(id).get();
	}

	@Override
	public CompteEpargne getCompteEpargneById(Long id) {
		// TODO Auto-generated method stub
		return compteEpargneRepository.findById(id).get();
	}


}
