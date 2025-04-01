# 📘 Gerenciamento de Livros e Autores com Spring Boot

Um projeto Spring Boot para gerenciamento de livros e autores, utilizando Spring Data JPA e H2 Database.

## 📋 Requisitos
- Java 17+
- Maven
- Spring Boot 3.x

## 🛠️ Tecnologias Utilizadas
- Spring Web
- Spring Data JPA
- H2 Database (banco em memória)
- Lombok (opcional)

## 🏗️ Estrutura do Projeto

### Entidades Principais
1. **Livro**
   - `id` (Long): Identificador único
   - `titulo` (String): Título do livro
   - `preco` (Double): Preço do livro
   - Relacionamento Many-to-One com Autor

2. **Autor**
   - `id` (Long): Identificador único
   - `nome` (String): Nome do autor
   - Relacionamento One-to-Many com Livro

### Repositórios
- **LivroRepository** (estende JpaRepository)
  - Métodos customizados:
    - Buscar livros com preço maior que X
    - Buscar livros com preço menor ou igual a X
    - Buscar livros por início do título

- **AutorRepository** (estende JpaRepository)
  - Métodos customizados:
    - Buscar autores pelo nome
    - Buscar autor por ID incluindo livros (com JOIN FETCH)

## 🚀 Como Executar
1. Clone o repositório:
   ```bash
   git clone [URL_DO_REPOSITORIO]
