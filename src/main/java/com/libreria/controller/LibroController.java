package com.libreria.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.entita.Libro;
import com.libreria.service.LibroService;

@RestController //marcatore che serve ad indicare che è una classe di tipo Controller
@RequestMapping("/libri") //punto di ingresso al nostro Controller(la root principale)


public class LibroController {
@Autowired
private LibroService libroService;
/*
	@GetMapping("/Test") //marcatore aggiuntivo per accedere al metodo (/libri/Test)
	public void Test() {
		System.out.println("test"); 
		}*/
	
	@PostMapping("/create") 
	public ResponseEntity <Libro> insert(@RequestBody Libro libro){
		
		if(libro.getTitolo()==null || libro.getAutore()==null || libro.getEditore()==null || libro.getPrezzo()==0) {
			return ResponseEntity.badRequest().build();
		}
		
		libroService.save(libro);
		
		return ResponseEntity.ok(libro);
	}
	
	@PostMapping("/update/{id}") //l'id lo prendiamo dall'url tramite il marcatore @pathvariable, gli altri campi li prendiamo dal marcatore Request 
	public ResponseEntity<Libro> update (@PathVariable("id")int id, @RequestBody Libro libro){
		
		//controlliamo che l'utente ci abbia inviato tutti i dati che ci servono 
		if(libro.getTitolo()==null || libro.getAutore()==null || libro.getEditore()==null || libro.getPrezzo()==0 || id==0) {
			return ResponseEntity.badRequest().build();
		}
		
		Libro libroUpdate= new Libro();
		Optional<Libro> libroDb=libroService.findById(id); //creo oggetto optionalLibro=libro presente sul db con lo stesso id
		if(!libroDb.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		libroUpdate=libroDb.get(); //libroUp è uguale a librodb ovvero quello recuperato dal db 
		
		//il titolo passato dal body della request viene salvato su libroUpdate che è una copia locale del nostro db
		libroUpdate.setTitolo(libro.getTitolo()); //get recupera,set imposta
		
		libroUpdate.setPrezzo(libro.getPrezzo());
		
		libroUpdate.setAutore(libro.getAutore());
		
		libroUpdate.setEditore(libro.getEditore());
		
		libroUpdate.setId(id);
		
		libroService.save(libroUpdate); //qui viene salvato nel db
		
		return ResponseEntity.ok(libro);
		
		
		
		
		
	}
}

