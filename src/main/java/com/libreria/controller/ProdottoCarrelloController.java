package com.libreria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.entita.ProdottoCarrello;
import com.libreria.service.ProdottoCarrelloService;

@RestController
@RequestMapping("/prodottoCarrello")
public class ProdottoCarrelloController {

    @Autowired
    private ProdottoCarrelloService prodottoCarrelloService;

    @PostMapping
    public ResponseEntity<ProdottoCarrello> insert(@RequestBody ProdottoCarrello prodottoCarrello) {
        if (prodottoCarrello.getQuantita() == null || prodottoCarrello.getPrezzo_unitario() == null) {
            return ResponseEntity.badRequest().build();
        }

        prodottoCarrelloService.save(prodottoCarrello);
        return ResponseEntity.ok(prodottoCarrello);
    }
}
