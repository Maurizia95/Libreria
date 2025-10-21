package com.libreria.entita;

import java.text.DateFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@@Table(name= "orders")
public class Ordine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="order_date", nullable=false)
	private DateFormat data_ordine;
	
	@Column(name="order_status", nullable=false)
	private String stato_ordine;
	
	//getter e setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DateFormat getData_ordine() {
		return data_ordine;
	}

	public void setData_ordine(DateFormat data_ordine) {
		this.data_ordine = data_ordine;
	}

	public String getStato_ordine() {
		return stato_ordine;
	}

	public void setStato_ordine(String stato_ordine) {
		this.stato_ordine = stato_ordine;
	}

	//costruttori
	public Ordine(DateFormat data_ordine, String stato_ordine) {
		setData_ordine(data_ordine);
		setStato_ordine(stato_ordine);
	}
	
	
	public Ordine() {}

}
