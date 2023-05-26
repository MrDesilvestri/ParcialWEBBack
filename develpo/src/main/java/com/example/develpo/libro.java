package com.example.develpo;


import jakarta.persistence.*;

@Entity
@Table(name = "libro_carlosDs")
public class libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String titulo;
    private String referencia;
    private String autor;
    private double precio;
    private String ubicacion;

    public libro() {
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getReferencia() {
        return referencia;
    }
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(long precio) {
        this.precio = precio;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    

    
}
