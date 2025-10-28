package com.libreria.entita;
import java.text.DateFormat;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "payments")
public class Pagamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="payment_date", nullable=false)
	private DateFormat dataPagamento;
	
	@Column(name="payment_method", nullable=false)
	private String metodoPagamento;
	
	@Column(name="payment_amount", nullable=false)
	private Double importoPagamento;
	
	@Column(name="payment_status", nullable=false)
	private String statoPagamento;

	
	//getter e setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DateFormat getDataPagamento() {
		return dataPagamento;
	}

	public void setData_pagamento(DateFormat dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public String getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public Double getImportoPagamento() {
		return importoPagamento;
	}

	public void setImporto_pagamento(Double importoPagamento) {
		this.importoPagamento = importoPagamento;
	}

	public String getStatoPagamento() {
		return statoPagamento;
	}

	public void setStato_pagamento(String statoPagamento) {
		this.statoPagamento = statoPagamento;
	}


	
	public Pagamento(DateFormat dataPagamento, String metodoPagamento, Double importoPagamento,
			String statoPagamento) {
		setData_pagamento(dataPagamento);
		setMetodoPagamento(metodoPagamento);		
		setImporto_pagamento(importoPagamento);
		setStato_pagamento(statoPagamento);	}
	
	
	
	public Pagamento() {}
	
}
