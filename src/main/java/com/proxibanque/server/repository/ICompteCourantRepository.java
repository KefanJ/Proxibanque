package com.proxibanque.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proxibanque.server.entity.CompteCourant;

public interface ICompteCourantRepository extends JpaRepository<CompteCourant, Long> {

}
