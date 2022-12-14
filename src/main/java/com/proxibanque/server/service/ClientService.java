package com.proxibanque.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proxibanque.server.entity.Client;
import com.proxibanque.server.repository.IClientRepository;

@Service
public class ClientService implements IClientService {
	
	@Autowired
	IClientRepository repository;
	

	@Override
	public Client addClient(Client client) {
		// TODO Auto-generated method stub
		return repository.save(client);
	}

	@Override
	public List<Client> getClients() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Client updateClient(Client client) {
		// TODO Auto-generated method stub
		
		
		return repository.save(client);
	}

	@Override
	public void deleteClient(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}
	
}
