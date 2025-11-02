\# 🚀 API RESTful de Cadastro de Usuários



Este projeto é uma API REST completa para gerenciamento de usuários (CRUD), desenvolvida em \*\*Spring Boot 3\*\*. Ele demonstra boas práticas de arquitetura, validação de dados, tratamento de exceções e segurança básica.



\## ✨ Funcionalidades Principais



\* \*\*C\*\*reate, \*\*R\*\*ead, \*\*U\*\*pdate, \*\*D\*\*elete (CRUD completo).

\* \*\*Criação em Lote (`/batch`)\*\* para múltiplos cadastros.

\* \*\*Validação de Dados\*\* com Jakarta Bean Validation (`@NotBlank`, `@Email`, etc.).

\* \*\*Restrição de E-mail Único\*\* no banco de dados.

\* \*\*Tratamento de Exceções\*\* personalizado: Retorno `400 Bad Request` e `409 Conflict`.

\* \*\*Segurança\*\* com Spring Security (Autenticação Basic Auth em memória).

\* \*\*Arquitetura em Camadas\*\* (Controller, Service, Repository).



\## 🧱 Arquitetura do Projeto



A aplicação segue a arquitetura em três camadas, garantindo a separação de responsabilidades e facilitando a manutenção e a escalabilidade.



\## 📈 Diagrama de Camadas (Mermaid)



```mermaid

graph TD

&nbsp;   A\[Cliente: Postman/Front-end] -->|Requisição HTTP| B(Controller);

&nbsp;   B -->|Chama a Lógica| C(Service Layer);

&nbsp;   C -->|Persistência de Dados| D(Repository);

&nbsp;   D -->|SQL| E(\[Banco de Dados H2]);

&nbsp;   E --> D;

&nbsp;   D --> C;

&nbsp;   C --> B;

&nbsp;   B -->|Resposta HTTP| A;



&nbsp;   style B fill:#f9f,stroke:#333

&nbsp;   style C fill:#ccf,stroke:#333

&nbsp;   style D fill:#ddf,stroke:#333

&nbsp;   style E fill:#eef,stroke:#333

