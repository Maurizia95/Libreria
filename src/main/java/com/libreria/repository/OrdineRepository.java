package com.libreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.libreria.entita.Ordine;

@Repository
public interface OrdineRepository extends JpaRepository<Ordine, Integer> {
    
}
