package com.proxibanque.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proxibanque.server.entity.CompteEpargne;

public interface ICompteEpargneRepository extends JpaRepository<CompteEpargne, Long> {

}
