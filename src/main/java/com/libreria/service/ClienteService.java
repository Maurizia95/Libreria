package com.libreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.entita.Cliente;
import com.libreria.repository.ClienteRepository;

@Service
public class ClienteService {

@Autowired ClienteRepository clienteRepository;	
	public Cliente save(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
}
