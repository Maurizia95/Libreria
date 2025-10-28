package com.libreria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.entita.Prodotto_carrello;

@RestController
@RequestMapping("/prodottoCarrello")
public class ProdottoCarrelloController {

	@Autowired private ProdottoCarelloService;
	
	@PostMapping("/prodottoCarrello")
	public ResponseEntity<prodottoCarrello> insert(@RequestBody Prodotto_carrello prodottoCarrello){
		if(quantita==null || prezzoUnitario ==null) {
			return ResponseEntity.badRequest().build();
		}
		prodottoService.save(prodottoCarrello);
		return ResponseEntity.ok(prodottoCarrello);
	}
	
}
