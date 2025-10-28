package com.libreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.entita.Magazzino;
import com.libreria.repository.MagazzinoRepository;


@Service
public class MagazzinoService {

	@Autowired
	private MagazzinoRepository magazzinoRepository; 
	
	public Magazzino save(Magazzino magazzino) {
		return magazzinoRepository.save(magazzino); 
	}

}
