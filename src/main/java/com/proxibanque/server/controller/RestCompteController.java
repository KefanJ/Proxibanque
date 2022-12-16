package com.proxibanque.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.proxibanque.server.entity.CompteCourant;
import com.proxibanque.server.service.CompteBancaireService;

@RestController
public class RestCompteController {

	@Autowired
	CompteBancaireService service;
	
	@GetMapping("/comptecourant/{id}")
	public CompteCourant getCompteCourantById(@PathVariable("id") Long id) {
		return service.getCompteCourantById(id);
	}
	
//	@PutMapping("/comptecourant/{id}")
//	public CompteCourant updateCompteCourant(@PathVariable("id")Long id) {
//		return service.updateCompteCourant(null)
//	}
//	
}
