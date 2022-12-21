package com.proxibanque.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proxibanque.server.entity.Compte;
import com.proxibanque.server.service.CompteBancaireService;

@RestController
@RequestMapping("/compte")
@CrossOrigin(origins = {"http://localhost:4200"})
public class RestCompteController {

	@Autowired
	CompteBancaireService service;
	
	
	@GetMapping("/{id}")
	public Compte getCompteById(@PathVariable("id") Long id) {
		return service.geCompteById(id);
	}
	
	
	@PutMapping
	public Compte updateCompte(@RequestBody Compte compte) {
		return service.updateCompte(compte);
	}
	
	
	
//	@GetMapping("/comptecourant/{id}")
//	public CompteCourant getCompteCourantById(@PathVariable("id") Long id) {
//		return service.getCompteCourantById(id);
//	}
//	
//	@PutMapping("/comptecourant")
//	public CompteCourant updateCompteCourant(@RequestBody CompteCourant compteCourant) {
//		return service.updateCompteCourant(compteCourant);
//	}
//	
//	@PostMapping("/comptecourant")
//	public CompteCourant createCompteCourant(@RequestBody CompteCourant compteCourant) {
//		return service.addCompteCourant(compteCourant);
//	}
//	
//	
//	@PostMapping("/compteepargne")
//	public CompteEpargne createCompteEpargne(@RequestBody CompteEpargne compteEpargne) {
//		return service.addCompteEpargne(compteEpargne);
//	}
	
//	@DeleteMapping("/comptecourant/{id}")
//	public void deleteCompteCourant(@PathVariable("id") Long id) {
//		service.deleteCompteCourant(id);
//	}
//	
//	@GetMapping("/compteepargne/{id}")
//	public CompteEpargne getCompteEpargneById(@PathVariable("id") Long id) {
//		return service.getCompteEpargneById(id);
//	}
//	
//	@PutMapping("/compteepargne")
//	public CompteEpargne updateCompteEpargne(@RequestBody CompteEpargne compteEpargne) {
//		return service.updateCompteEpargne(compteEpargne);
//	}
//	
//	@DeleteMapping("/compteepargne/{id}")
//	public void deleteCompteEpargne(@PathVariable("id") Long id) {
//		service.deleteCompteEpargne(id);
//	}
	
}
