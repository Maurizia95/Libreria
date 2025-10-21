package com.libreria.entita;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "store")
public class Magazzino {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="available_quantity", nullable=false) 
	private Integer quantita_disponibile;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantita_disponibile() {
		return quantita_disponibile;
	}

	public void setQuantita_disponibile(Integer quantita_disponibile) {
		this.quantita_disponibile = quantita_disponibile;
	}

	public Magazzino(Integer quantita_disponibile) {
		setQuantita_disponibile(quantita_disponibile);
		
	}
	
	
	public Magazzino() {}
	
	
	
}
