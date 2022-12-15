package com.proxibanque.server.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proxibanque.server.entity.Client;
import com.proxibanque.server.entity.CompteCourant;
import com.proxibanque.server.entity.CompteEpargne;
import com.proxibanque.server.repository.IClientRepository;
import com.proxibanque.server.repository.ICompteBancaire;

@Service
public class ClientService implements IClientService {
	
	@Autowired
	IClientRepository repository;
	
	@Autowired
	ICompteBancaire compteRepository;
	

	@Override
	public Client addClient(Client client) {
		// TODO Auto-generated method student4
		
		Date date = new Date();

		CompteCourant compteCourant = new CompteCourant(client, 100d, date, 1000d);
		CompteEpargne compteEpargne = new CompteEpargne(client, 100d, date, 3d);
		client.setCompteCourant(compteCourant);
		client.setCompteEpargne(compteEpargne);
	
		
		//addCompteCourant(compteCourant);
		//addCompteEpargne(compteEpargne);
		
		System.out.println(compteCourant.getNumCompte());
		
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
		
		CompteCourant compteCourant = (CompteCourant) compteRepository.findById(client.getCompteCourant().getNumCompte()).get();
		CompteEpargne compteEpargne = (CompteEpargne) compteRepository.findById(client.getCompteEpargne().getNumCompte()).get();
		
		client.setCompteCourant(compteCourant);
		client.setCompteEpargne(compteEpargne);
		updateCompteCourant(compteCourant);
		updateCompteEpargne(compteEpargne);
		return repository.save(client);
	}

	@Override
	public void deleteClient(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public CompteCourant addCompteCourant(CompteCourant compteCourant) {
		// TODO Auto-generated method stub
		
		return compteRepository.save(compteCourant);
		
		
	}

	@Override
	public CompteEpargne addCompteEpargne(CompteEpargne compteEpargne) {
		// TODO Auto-generated method stub
		return compteRepository.save(compteEpargne);
	}

	@Override
	public CompteCourant updateCompteCourant(CompteCourant compteCourant) {
		// TODO Auto-generated method stub
		
		return compteRepository.save(compteCourant);
	}

	@Override
	public CompteEpargne updateCompteEpargne(CompteEpargne compteEpargne) {
		// TODO Auto-generated method stub
		return compteRepository.save(compteEpargne);
	}
	
}
