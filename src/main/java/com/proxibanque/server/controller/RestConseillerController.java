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

import com.proxibanque.server.entity.Conseiller;
import com.proxibanque.server.service.ConseillerService;

@RestController
@RequestMapping("/conseillers")
@CrossOrigin(origins = {"http://localhost:4200"})
public class RestConseillerController {
	@Autowired
	ConseillerService service;
	
	@PostMapping
	public Conseiller createClient(@RequestBody Conseiller conseiller) {
		
		return service.addConseiller(conseiller);
	}
	
	@GetMapping
	public List<Conseiller>getConseiller(){
		return service.getConseillers();
	}
	
	@PutMapping
	public Conseiller updateConseiller(@RequestBody Conseiller conseiller) {
		return service.updateConseiller(conseiller);
	}
	
	@DeleteMapping("/{id}")
	public void deleteConseiller(@PathVariable("id")Long id) {
			service.deleteConseiller(id);
	}

}
