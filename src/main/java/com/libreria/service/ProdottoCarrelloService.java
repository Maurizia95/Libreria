package com.libreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.entita.ProdottoCarrello;
import com.libreria.repository.ProdottoCarrelloRepository;

@Service
public class ProdottoCarrelloService {

	@Autowired
	private ProdottoCarrelloRepository prodottoCarrelloRepository;
	
	public ProdottoCarrello save(ProdottoCarrello prodottoCarrello) {
		return prodottoCarrelloRepository.save(prodottoCarrello);
	}
}
