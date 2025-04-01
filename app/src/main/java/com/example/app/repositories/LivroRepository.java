package com.example.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.example.app.models.Livro;

//@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

    
    List<Livro> findByPrecoGreaterThan(Double valor);

    List<Livro> findByPrecoLessThanEqual(Double valor); 
    
    List<Livro> findByTituloStartingWith(String titulo);
}
    
