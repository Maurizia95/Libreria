package com.libreria.entita;
import java.text.DateFormat;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@jakarta.persistence.Table(name= "payments")
public class Pagamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="payment_date", nullable=false)
	private DateFormat data_pagamento;
	
	@Column(name="payment_method", nullable=false)
	private String metodo_pagamento;
	
	@Column(name="payment_amount", nullable=false)
	private Double importo_pagamento;
	
	@Column(name="payment_status", nullable=false)
	private String stato_pagamento;

	
	//getter e setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DateFormat getData_pagamento() {
		return data_pagamento;
	}

	public void setData_pagamento(DateFormat data_pagamento) {
		this.data_pagamento = data_pagamento;
	}

	public String getMetodo_pagamento() {
		return metodo_pagamento;
	}

	public void setMetodo_pagamento(String metodo_pagamento) {
		this.metodo_pagamento = metodo_pagamento;
	}

	public Double getImporto_pagamento() {
		return importo_pagamento;
	}

	public void setImporto_pagamento(Double importo_pagamento) {
		this.importo_pagamento = importo_pagamento;
	}

	public String getStato_pagamento() {
		return stato_pagamento;
	}

	public void setStato_pagamento(String stato_pagamento) {
		this.stato_pagamento = stato_pagamento;
	}


	
	public Pagamento(DateFormat data_pagamento, String metodo_pagamento, Double importo_pagamento,
			String stato_pagamento) {
		setData_pagamento(data_pagamento);
		setMetodo_pagamento(metodo_pagamento);		
		setImporto_pagamento(importo_pagamento);
		setStato_pagamento(stato_pagamento);	}
	
	
	
	public Pagamento() {}
	
}
