package com.example.develpo;

import jakarta.persistence.*;


public class libro {

    @Column
    private String titulo;
    @Column
    private String referencia;
    @Column
    private String autor;
    @Column
    private double precio;
    @Column
    private String ubicacion;

    public libro() {
    }

    
}
