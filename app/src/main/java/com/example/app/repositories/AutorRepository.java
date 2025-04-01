package com.example.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.app.models.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {

    List<Autor> findByNomeStartingWith(String nome);

    @Query("SELECT a FROM Autor a LEFT JOIN FETCH a.livros WHERE a.id = :id")
    Autor findAutorWithLivrosById(@Param("id") Long id);
}
