package com.proxibanque.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proxibanque.server.entity.Client;
import com.proxibanque.server.service.ClientService;

@RestController
@RequestMapping("/clients")
public class RestClientController {
	@Autowired
	ClientService service;
	
	@PostMapping
	public Client createClient(@RequestBody Client client) {
		
		return service.addClient(client);
	}
	
	@GetMapping
	public List<Client>getJoueurs(){
		return service.getClients();
	}
	
	@PutMapping
	public Client updateClient(@RequestBody Client client) {
		return service.updateClient(client);
	}
	
	@DeleteMapping("/{id}")
	public void deleteClient(@PathVariable("id")Long id) {
			service.deleteClient(id);
	}

}
