package com.libreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libreria.entita.Magazzino;


@Repository
public interface MagazzinoRepository extends JpaRepository<Magazzino, Integer> {
    
}
