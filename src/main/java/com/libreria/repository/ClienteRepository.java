package com.libreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libreria.entita.Cliente;
import com.libreria.entita.Libro;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> { //interfaccia che ci permette di comunicare con il database per fare delle query tramite metodi creati con parole chiavi
	

}
