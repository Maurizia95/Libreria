package com.libreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.libreria.entita.Ordine;
import com.libreria.repository.OrdineRepository;

@Service
public class OrdineService {

    @Autowired
    private OrdineRepository ordineRepository;

    public Ordine save(Ordine ordine) {
        return ordineRepository.save(ordine);
    }
}
