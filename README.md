📘 Projeto: Gerenciamento de Livros e Autores com Spring Boot

📌 Observação

Para desenvolver este projeto, será necessário criar um novo projeto Spring Boot com os seguintes starters:

Spring Web

Spring Data JPA

H2 Database

📝 Enunciado

📖 Parte 1 – Livro e LivroRepository

📌 1. Criar a entidade Livro

A entidade Livro deve conter os seguintes atributos:

id: Identificador único do livro (Long)

titulo: Título do livro (String)

preco: Preço do livro (Double)

📌 2. Criar o repositório LivroRepository

Criar um repositório Spring Data JPA chamado LivroRepository, que estende JpaRepository, com os seguintes métodos:

Buscar livros com preço maior que um determinado valor

Parâmetro: Double valor

Retorna uma lista de livros cujo preço seja maior que o valor informado.

Buscar livros com preço menor ou igual a um determinado valor

Parâmetro: Double valor

Retorna uma lista de livros cujo preço seja menor ou igual ao valor informado.

Buscar livros pelo início do título

Parâmetro: String titulo

Retorna uma lista de livros cujo título começa com o texto informado.

📌 3. Criar um método de teste para Livro

Criar uma classe main ou um método de teste que:

Insira pelo menos 3 livros no banco.

Demonstre que os métodos do repositório estão funcionando corretamente, utilizando System.out.println() para exibir os resultados no console.

🖊️ Parte 2 – Autor e AutorRepository

📌 1. Criar a entidade Autor

A entidade Autor deve conter os seguintes atributos:

id: Identificador único do autor (Long)

nome: Nome do autor (String)

📌 2. Implementar o relacionamento entre Autor e Livro

Cada autor pode ter vários livros associados a ele, mas um livro pertence a apenas um autor. Este relacionamento deve ser implementado corretamente utilizando anotações do JPA.

📌 3. Criar o repositório AutorRepository

Criar um repositório Spring Data JPA chamado AutorRepository, que estende JpaRepository, com os seguintes métodos:

Buscar autores pelo nome

Parâmetro: String nome

Retorna uma lista de autores cujo nome começa com o valor informado.

Buscar um autor pelo ID, incluindo seus livros

Parâmetro: Long id

Retorna um autor específico e todos os seus livros associados.

Para isso, utilizar @Query com LEFT JOIN FETCH.

📌 4. Criar um método de teste para Autor

Criar uma classe main ou um método de teste que:

Insira pelo menos 2 autores, cada um com livros associados.

Demonstre que os métodos do repositório estão funcionando corretamente, utilizando System.out.println() para exibir os resultados no console.

🚀 Tecnologias Utilizadas

Java 17+

Spring Boot

Spring Data JPA

H2 Database (Banco de dados em memória para testes)
