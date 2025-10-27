package com.libreria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.entita.Ordine;

@RestController
@RequestMapping("/ordine")
public class OrdineController {
@Autowired OrdineService ordineService;

/*
@GetMapping("/Test") //marcatore aggiuntivo per accedere al metodo (/ordine/Test)
public void Test() {
	System.out.println("test"); 
	}*/

@PostMapping("/create")
public ResponseEntity <Ordine> insert(RequestBody Ordine ordine){
	
	if(data_ordine==null || stato_ordine==null) {
		return ResponseEntity.badRequest().build();
	}
	
	ordineService.save(ordine);
	return ResponseEntity.ok(ordine);
}

}
