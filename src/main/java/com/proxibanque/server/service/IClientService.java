package com.proxibanque.server.service;

import java.util.List;

import com.proxibanque.server.entity.Client;

public interface IClientService {
	public Client addClient(Client client);
	public List<Client> getClients();
	public Client updateClient(Client client);
	public void deleteClient(Long id);
}
