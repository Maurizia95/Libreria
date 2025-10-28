package com.libreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libreria.entita.Carrello;
import com.libreria.entita.ProdottoCarrello;

public interface ProdottoCarrelloRepository extends JpaRepository<ProdottoCarrello, Integer> {
}
