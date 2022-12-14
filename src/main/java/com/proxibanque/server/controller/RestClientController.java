	package com.proxibanque.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins = {"http://localhost:4200"})
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
	
	@GetMapping("/{id}")
	public Client getClientById(@PathVariable("id") Long id){
		return service.getClientById(id);
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
