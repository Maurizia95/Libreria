package com.libreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.entita.Pagamento;
import com.libreria.repository.PagamentoRepository;

@Service
public class PagamentoService {
@Autowired 
	private PagamentoRepository pagamentoRepository;
	
public Pagamento save(Pagamento pagamento) {
	return pagamentoRepository.save(pagamento);
}

}
