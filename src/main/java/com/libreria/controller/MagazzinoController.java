package com.libreria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.entita.Magazzino;
import com.libreria.entita.Ordine;
import com.libreria.service.OrdineService;

@RestController
@RequestMapping("/magazzino")
public class MagazzinoController {
	 @Autowired
	    private MagazzinoService magazzinoService;

	    @PostMapping("/create")
	    public ResponseEntity<Ordine> insert(@RequestBody Magazzino magazzino) {

	        if (magazzino.getQuantitaDisponibile() == null) {
	            return ResponseEntity.badRequest().build();
	        }

	        magazzinoService.save(magazzino);
	        return ResponseEntity.ok(magazzino);
	    }
	}
}
