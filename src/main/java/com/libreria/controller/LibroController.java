package com.libreria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.entita.Libro;
import com.libreria.service.LibroService;

@RestController //marcatore che serve ad indicare che è una classe di tipo Controller
@RequestMapping("/libri") //punto di ingresso al nostro Controller(la root principale)


public class LibroController {
@Autowired
private LibroService libroService;
/*
	@GetMapping("/Test") //marcatore aggiuntivo per accedere al metodo (/libri/Test)
	public void Test() {
		System.out.println("test"); 
		}*/
	
	@PostMapping("/create") 
	public ResponseEntity <Libro> insert(@RequestBody Libro libro){
		
		if(libro.getTitolo()==null || libro.getAutore()==null || libro.getEditore()==null || libro.getPrezzo()==0) {
			return ResponseEntity.badRequest().build();
		}
		
		libroService.save(libro);
		
		return ResponseEntity.ok(libro);
	}
	
}

