package com.libreria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.entita.Cliente;
import com.libreria.entita.Libro;
import com.libreria.service.ClienteService;

@RestController
@RequestMapping("/cliente")

public class ClienteController {
@Autowired
private ClienteService clienteService;
/*
@GetMapping("/Test") //marcatore aggiuntivo per accedere al metodo (/libri/Test)
public void Test() {
	System.out.println("test"); 
	}*/

@PostMapping("/create")
public ResponseEntity <Cliente> insert(@RequestBody Cliente cliente){ 
	
	if(cliente.getIndirizzo()==null || cliente.getEmail()==null || cliente.getTelefono()==null || cliente.getNome()==null || cliente.getCognome()==null) {
		return ResponseEntity.badRequest().build();
	}
	
	clienteService.save(cliente);
	
	return ResponseEntity.ok(cliente);
}

}

