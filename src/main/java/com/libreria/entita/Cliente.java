package com.libreria.entita;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name= "clients")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="name", nullable=false) 
	private String nome;
	
	@Column(name="surname", nullable=false)
	private String cognome;
	
	@Column(name="email", nullable=false)
	private String email;
	
	@Column(name="mobile", nullable=false) 
	private String telefono;
	
	@Column(name="address", nullable=false) 
	private String indirizzo;

	
	//getter e setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public Cliente(String nome, String cognome, String email, String telefono, String indirizzo) {
		setCognome(cognome);
		setCognome(cognome);
		setEmail(email);
		setTelefono(telefono);
		setIndirizzo(indirizzo);
		}

	public Cliente() {}
}
