 Repositório: [yanvferreira/todolist](https://github.com/yanvferreira/todolist)

# TodoList
[](https://github.com/yanvferreira/todolist)
API para gerenciar tarefas (CRUD) que faz parte [desse desafio](https://github.com/simplify-liferay/desafio-junior-backend-simplify)  para pessoas desenvolvedoras backend júnior, que se candidatam para a Simplify.

O projeto foi usado para aprender a desenvolver API com Spring Boot como mostrado [nesse vídeo](https://youtu.be/IjProDV001o).

## Tecnologias

[](https://github.com/yanvferreira/todolist?tab=readme-ov-file#tecnologias)

-   [Spring Boot](https://spring.io/projects/spring-boot)
-   [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
-   [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
-  [Spring Validation](https://docs.spring.io/spring-framework/reference/web/webflux/controller/ann-validation.html#page-title)
-   [SpringDoc OpenAPI](https://springdoc.org/#getting-started)
-   [PostgreSQL](https://www.postgresql.org/download/)
-  [Postman](https://www.postman.com/downloads/)

## Práticas adotadas

[](https://github.com/yanvferreira/todolist?tab=readme-ov-file#pr%C3%A1ticas-adotadas)

-   SOLID, DRY, YAGNI, KISS
-   API REST
-   Consultas com Spring Data JPA
-   Injeção de Dependências
-   Tratamento de respostas de erro
-   Geração automática do Swagger com a OpenAPI

## Como Executar

[](https://github.com/yanvferreira/todolist?tab=readme-ov-file#como-executar)

-   Clonar repositório git
-   Construir o projeto:

```
$ ./mvnw clean package

```

-   Executar a aplicação:

```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar

```

A API poderá ser acessada em  [localhost:8080](http://localhost:8080/). O Swagger poderá ser visualizado em  [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

[](https://github.com/yanvferreira/todolist?tab=readme-ov-file#api-endpoints)

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta  [Postman](https://www.postman.com/downloads/):

-   Criar Tarefa

```
$ http POST :8080/todos

[
  {	  
    "nome": "Todo 1",
    "descricao": "Desc Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]

```

-   Listar Tarefas

```
$ http GET :8080/todos

```

-   Atualizar Tarefa

```
$ http PUT :8080/todos/1 

[
  {
	"id": 1,
    "nome": "Todo 1 Up",
    "descricao": "Desc Todo 1 Up",
    "prioridade": 2,
    "realizado": false
  }
]

```

-   Remover Tarefa

```
http DELETE :8080/todos/1

```
