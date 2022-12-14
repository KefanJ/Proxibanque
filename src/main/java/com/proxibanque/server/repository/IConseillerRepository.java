package com.proxibanque.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proxibanque.server.entity.Conseiller;

public interface IConseillerRepository extends JpaRepository<Conseiller, Long> {
	
}
