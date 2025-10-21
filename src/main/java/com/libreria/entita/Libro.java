package com.libreria.entita;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //marcatore,serve per indicare che è una classe che descrive una entità
@Table(name= "books") //marcatore per rinominare la tabella che si va a creare sul database

public class Libro {
	//sezione attributi
	@Id //marcatore per indicare che quell'attributo è una primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //per popolarlo in modo automatico e incrementale

	private Integer id; //privati perchè quando istanziamo un oggetto libro possiamo intervenire tramite i metodi get e set
	
	@Column(name="title", nullable=false) //marcatore per creare la colonna nella tabella 
	//quello che c'è nelle () per indicare che la colonna è not null e che stiamo modificando il nome in inglese
	private String titolo;
	@Column(name="author", nullable=false)
	private String autore;
	@Column(name="publisher", nullable=false)
	private String editore;
	@Column(name="prize", nullable=false)
	private double prezzo;
	
	
	//sezione getter e setter
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getEditore() {
		return editore;
	}
	public void setEditore(String editore) {
		this.editore = editore;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public Libro(String titolo, String autore, String editore, double prezzo) {
		setTitolo(titolo);
		setAutore(autore);
		setEditore(editore);
		setPrezzo(prezzo);
	}
	
	public Libro() {}
	
	
	
}
