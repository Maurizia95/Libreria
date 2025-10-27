package com.libreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.entita.Libro;
import com.libreria.repository.LibroRepository;

@Service
public class LibroService {

	@Autowired
	private LibroRepository libroRepository; //importo un oggetto di tipo LibroRepository chiamato libroRepository
	
	public Libro save(Libro libro) { //metodo che salva una entità libro nel database 
		return libroRepository.save(libro); //tramite il metodo save del repository
	}
	
	
	
	
}
