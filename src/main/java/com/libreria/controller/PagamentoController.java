package com.libreria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.entita.Pagamento;
import com.libreria.service.PagamentoService;

@RestController
@RequestMapping("/pagamento")
public class PagamentoController {

	@Autowired
	private PagamentoService pagamentoService;
	
	@PostMapping
	public ResponseEntity<Pagamento> insert(@RequestBody Pagamento pagamento){
		if(pagamento.getDataPagamento()==null || pagamento.getMetodoPagamento()==null|| pagamento.getImportoPagamento()==null || pagamento.getStatoPagamento()==null) {
			return ResponseEntity.badRequest().build();
		}
		Pagamento pagamentoSalvato = pagamentoService.save(pagamento);
		return ResponseEntity.ok(pagamentoSalvato);
	}
}
