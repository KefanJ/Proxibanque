package com.proxibanque.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proxibanque.server.entity.Conseiller;
import com.proxibanque.server.repository.IConseillerRepository;

@Service
public class ConseillerService implements IConseillerService {
	
	@Autowired
	private IConseillerRepository repository;

	@Override
	public Conseiller addConseiller(Conseiller conseiller) {
		return repository.save(conseiller);
	}

	@Override
	public List<Conseiller> getConseillers() {
		return repository.findAll();
	}

	@Override
	public Conseiller updateConseiller(Conseiller conseiller) {
		return repository.save(conseiller);
	}

	@Override
	public void deleteConseiller(Long id) {
		repository.deleteById(id);
	}

}
