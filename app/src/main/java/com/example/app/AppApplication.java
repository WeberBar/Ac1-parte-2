package com.example.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.app.repositories.AutorRepository;
import com.example.app.repositories.LivroRepository;
import com.example.app.models.Autor;
import com.example.app.models.Livro;

@SpringBootApplication
public class AppApplication {
	Livro livro1, livro2, livro3;

	@Bean
	public CommandLineRunner init(
			LivroRepository livroRepository,
			AutorRepository autorRepository) {
		return args -> {
			System.out.println("Criando o livro...");
			livro1 = livroRepository.save(new Livro(null, "Bela e a fera", 256.00));
			livro2 = livroRepository.save(new Livro(null, "Bela maneira de viver", 100.00));
			livro3 = livroRepository.save(new Livro(null, "O conde do Monte Cristo", 230.00));
			System.out.println("Livros criados");
			System.out.println("Consultas Livro: ");
			System.out.println("Livros maiores que R$200");
			List<Livro> livrosCaros = livroRepository.findByPrecoGreaterThan(200.0);
			livrosCaros.forEach(System.out::println);
			System.out.println(" livros com preço menor ou igual a R$200");
			List<Livro> livrosBaratosOuIgua = livroRepository.findByPrecoLessThanEqual(200.0);
			livrosBaratosOuIgua.forEach(System.out::println);
			System.out.println(" livros cujo título comece com Bela");
			List<Livro> livrosComComecoIgual = livroRepository.findByTituloStartingWith("Bela");
			livrosComComecoIgual.forEach(System.out::println);
			System.out.println("Criando Autores...");
			Autor autor1 = autorRepository.save(new Autor(null, "João carlos"));
			Autor autor2 = autorRepository.save(new Autor(null, "João Roberto"));
			Autor autor3 = autorRepository.save(new Autor(null, "Julio Mendes"));
			System.out.println("Autores criados");
			System.out.println("Vincular Livro ao autor ");
			livro1.setAutor(autor1);
			livroRepository.save(livro1);
			livro2.setAutor(autor2);
			livroRepository.save(livro2);
			livro3.setAutor(autor3);
			livroRepository.save(livro3);
			System.out.println("Livros vinculados");
			System.out.println("Consultas Autor: ");
			System.out.println("Autores cujo o nome começa com João ");
			List<Autor> autoresQueComecamCom = autorRepository.findByNomeStartingWith("João");
			autoresQueComecamCom.forEach(System.out::println);
			System.out.println("Buscar autor pelo id:");
			System.out.println(autorRepository.findAutorWithLivrosById(1L));

		};
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);

	}

}
