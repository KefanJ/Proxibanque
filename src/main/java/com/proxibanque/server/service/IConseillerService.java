package com.proxibanque.server.service;

import java.util.List;

import com.proxibanque.server.entity.Conseiller;

public interface IConseillerService {
	public Conseiller addConseiller(Conseiller conseiller);
	public List<Conseiller> getConseillers();
	public Conseiller updateConseiller(Conseiller conseiller);
	public void deleteConseiller(Long id);
}
