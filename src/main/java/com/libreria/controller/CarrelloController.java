package com.libreria.controller;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.libreria.entita.Carrello;
import com.libreria.service.CarrelloService;

@RestController
@RequestMapping("/carrello")
public class CarrelloController {

    @Autowired
    private CarrelloService carrelloService;

    @PostMapping("/carrello")
    public ResponseEntity<Carrello> insert(@RequestBody Carrello carrello) {
        if (carrello == null) {
            return ResponseEntity.badRequest().build();
        }
        carrelloService.save(carrello);
        return ResponseEntity.ok(carrello);
    }
}
