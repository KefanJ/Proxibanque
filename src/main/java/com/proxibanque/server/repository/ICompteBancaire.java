package com.proxibanque.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proxibanque.server.entity.Compte;

public interface ICompteBancaire extends JpaRepository<Compte, Long> {

}
