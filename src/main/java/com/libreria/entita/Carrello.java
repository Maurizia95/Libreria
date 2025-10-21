package com.libreria.entita;

import java.text.DateFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "cart")
public class Carrello {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name="creation_date", nullable=true) 
	private DateFormat data_creazione;
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DateFormat getData_creazione() {
		return data_creazione;
	}

	public void setData_creazione(DateFormat data_creazione) {
		this.data_creazione = data_creazione;
	}

	
	public Carrello(DateFormat data_creazione) {
	
		setData_creazione(data_creazione);
	}
	
	
	public Carrello() {}
	
	
	
}

