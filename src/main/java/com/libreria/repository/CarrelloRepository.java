package com.libreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.libreria.entita.Carrello;

public interface CarrelloRepository extends JpaRepository<Carrello, Integer> {
}
