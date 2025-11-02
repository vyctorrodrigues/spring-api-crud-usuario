# 🚀 API RESTful de Cadastro de Usuários

Este projeto é uma API REST completa para gerenciamento de usuários (CRUD), desenvolvida em **Spring Boot 3**. Ele demonstra boas práticas de arquitetura, validação de dados, tratamento de exceções e segurança básica.

## ✨ Funcionalidades Principais

* **C**reate, **R**ead, **U**pdate, **D**elete (CRUD completo).
* **Criação em Lote (`/batch`)** para múltiplos cadastros.
* **Validação de Dados** com Jakarta Bean Validation (`@NotBlank`, `@Email`, etc.).
* **Restrição de E-mail Único** no banco de dados.
* **Tratamento de Exceções** personalizado: Retorno `400 Bad Request` e `409 Conflict`.
* **Segurança** com Spring Security (Autenticação Basic Auth em memória).
* **Arquitetura em Camadas** (Controller, Service, Repository).

## 🧱 Arquitetura do Projeto

A aplicação segue a arquitetura em três camadas, garantindo a separação de responsabilidades e facilitando a manutenção e a escalabilidade.

## 📈 Diagrama de Camadas (Mermaid)

```mermaid
graph TD
    A[Cliente: Postman/Front-end] -->|Requisição HTTP| B(Controller);
    B -->|Chama a Lógica| C(Service Layer);
    C -->|Persistência de Dados| D(Repository);
    D -->|SQL| E([Banco de Dados H2]);
    E --> D;
    D --> C;
    C --> B;
    B -->|Resposta HTTP| A;

    style A fill:#006d33,stroke:#101d10
    style B fill:#8b0000,stroke:#2d0000
    style C fill:#003366,stroke:#00001a
    style D fill:#4a4a4a,stroke:#1a1a1a
    style E fill:#4b0082,stroke:#190033
