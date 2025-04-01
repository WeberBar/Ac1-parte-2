package com.example.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 200, nullable = false)
    private String titulo;
    @Column(nullable = false)
    private Double preco;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor
    ;
    public Livro(){

    }
    public Livro(Long id, String titulo, Double preco) {
        this.id = id;
        this.titulo = titulo;
        this.preco = preco;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

 @Override
public String toString() {
    return String.format("Livro{id=%d, titulo='%s', preco=%.2f}", id, titulo, preco);
}



}