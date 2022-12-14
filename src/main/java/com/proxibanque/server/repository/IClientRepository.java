package com.proxibanque.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proxibanque.server.entity.Client;

public interface IClientRepository extends JpaRepository<Client, Long> {
	
}
