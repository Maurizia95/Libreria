package com.libreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.libreria.entita.Carrello;
import com.libreria.repository.CarrelloRepository;

@Service
public class CarrelloService {

    @Autowired
    private CarrelloRepository carrelloRepository;

    public Carrello save(Carrello carrello) {
        return carrelloRepository.save(carrello);
    }
}
