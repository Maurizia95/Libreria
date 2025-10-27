package com.libreria.entita;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Ordine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "order_date", nullable = false)
    private LocalDate dataOrdine;

    @Column(name = "order_status", nullable = false)
    private String statoOrdine;

    // Getter e Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataOrdine() {
        return dataOrdine;
    }

    public void setDataOrdine(LocalDate dataOrdine) {
        this.dataOrdine = dataOrdine;
    }

    public String getStatoOrdine() {
        return statoOrdine;
    }

    public void setStatoOrdine(String statoOrdine) {
        this.statoOrdine = statoOrdine;
    }

    // Costruttori
    public Ordine(LocalDate dataOrdine, String statoOrdine) {
        this.dataOrdine = dataOrdine;
        this.statoOrdine = statoOrdine;
    }

    public Ordine() {}
}
