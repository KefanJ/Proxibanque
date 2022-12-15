package com.proxibanque.server.service;

import java.util.List;

import com.proxibanque.server.entity.Client;
import com.proxibanque.server.entity.CompteCourant;
import com.proxibanque.server.entity.CompteEpargne;

public interface IClientService {
	public Client addClient(Client client);
	public List<Client> getClients();
	public Client updateClient(Client client);
	public void deleteClient(Long id);
	public CompteCourant addCompteCourant(CompteCourant compteCourant);
	public CompteEpargne addCompteEpargne(CompteEpargne  compteEpargne );
	public CompteCourant updateCompteCourant(CompteCourant compteCourant);
	public CompteEpargne updateCompteEpargne(CompteEpargne compteEpargne);
	public CompteCourant getCompteCourantById(Long id);
	public CompteEpargne getCompteEpargneById(Long id);
	
}
