# Projeto Web Services com Spring Boot e JPA

## Sobre o Projeto
Este projeto é uma API RESTful completa desenvolvida durante o curso de Java Completo (Prof. Nélio Alves).
O objetivo principal é consolidar o conhecimento no ecossistema Spring Boot, aplicando conceitos de mapeamento objeto-relacional (ORM) e estruturação de serviços web seguindo as melhores práticas do mercado.

O sistema simula um domínio de pedidos, gerenciando usuários, categorias, produtos e pagamentos, com associações complexas entre as entidades.

## Arquitetura e Padrões
O projeto foi estruturado seguindo o padrão de camadas, garantindo a separação de responsabilidades e facilitando a manutenção:
- **Resource**: Controladores REST que interceptam as requisições web.
- **Service:** Camada de lógica de negócio e regras do sistema.
- **Repository:** Camada de acesso a dados (Spring Data JPA).
- **Domain:** Modelagem das entidades com JPA/Hibernate.

## Diferenciais Técnicos:
- **Tratamento de Exceções:** Implementação de handlers para respostas de erro customizadas (ex: Recurso não encontrado).
- **Seed de Banco de Dados:** Instanciação automática de dados de teste (Database Seeding) para perfis de desenvolvimento.

## 🛠️ Tecnologias Utilizadas
- **Linguagem:** Java 25
- **Framework:** Spring Boot 4.0.6
- **ORM:** JPA / Hibernate
- **Banco de Dados:** H2 (Testes) e MySQL (Desenvolvimento)
- **Ferramentas:** Maven, Postman, Spring Tools for Eclipse

## 🛣️ Endpoints Principais
- `GET /users` - Lista todos os usuários.
- `GET /users/{id}` - Busca usuário por ID.
- `GET /products` - Lista todos os produtos.
- `GET /categories` - Lista categorias cadastradas.

## ⚙️ Como executar
1. Clone o repositório:
   ```bash
   git clone git@github.com:Lukasgmrs/workshop-springboot4-jpa.git

Importe o projeto em sua IDE (IntelliJ ou Eclipse) como um projeto Maven.
  
Certifique-se de ter o JDK configurado.

Execute a classe principal BackendProjectApplication.java.

A API estará disponível em http://localhost:8080.

Desenvolvido por Lucas Gabriel de Moraes
www.linkedin.com/in/lucasg-moraes
