package com.libreria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.entita.Ordine;
import com.libreria.service.OrdineService;

@RestController
@RequestMapping("/ordine")
public class OrdineController {

    @Autowired
    private OrdineService ordineService;

    @PostMapping("/create")
    public ResponseEntity<Ordine> insert(@RequestBody Ordine ordine) {

        if (ordine.getDataOrdine() == null || ordine.getStatoOrdine() == null) {
            return ResponseEntity.badRequest().build();
        }

        ordineService.save(ordine);
        return ResponseEntity.ok(ordine);
    }
}

