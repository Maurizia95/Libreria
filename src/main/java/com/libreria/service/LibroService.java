package com.libreria.service;

import java.util.Optional;

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

	public Optional<Libro> findById(int id) { //Optional potrebbe o non potrebbe ritornare un oggetto Libro
		
		return libroRepository.findById(id);
	}
	
	
	
	
}
