package com.libreria.entita;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "product_cart")
public class ProdottoCarrello {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="quantity", nullable=false) 
	private Integer quantita;
	
	@Column(name="unit_price", nullable=false) 
	private Integer prezzo_unitario;

	
	
	//getter e setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantita() {
		return quantita;
	}

	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}

	public Integer getPrezzo_unitario() {
		return prezzo_unitario;
	}

	public void setPrezzo_unitario(Integer prezzo_unitario) {
		this.prezzo_unitario = prezzo_unitario;
	}

	public ProdottoCarrello(Integer quantita, Integer prezzo_unitario) {
		setQuantita(quantita);
		setPrezzo_unitario(prezzo_unitario);
	}
	
	
	public ProdottoCarrello() {}

}
