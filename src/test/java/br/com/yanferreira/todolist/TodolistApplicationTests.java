package br.com.yanferreira.todolist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

import br.com.yanferreira.todolist.entity.Todo;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class TodolistApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testeCreateTodoSuccess() {
		var todo = new Todo("todo 1", "desc todo 1", false, 1);

		webTestClient
		.post()
		.uri("/todos")
		.bodyValue(todo)
		.exchange()
		.expectStatus().isOk()
		.expectBody()
		.jsonPath("$").isArray()
		.jsonPath("$.length()").isEqualTo(1)
		.jsonPath("$[0].nome").isEqualTo(todo.getNome())
		.jsonPath("$[0].descricao").isEqualTo(todo.getDescricao())
		.jsonPath("$[0].realizado").isEqualTo(todo.isRealizado())
		.jsonPath("$[0].prioridade").isEqualTo(todo.getPrioridade());
	}

	@Test
	void testeCreateTodoFailure() {

		webTestClient
		.post()
		.uri("/todos")
		.bodyValue(
			new Todo("", "", false, 0)
		).exchange()
		.expectStatus().isBadRequest();

	}

	/*@Test
	void testeUpdateSuccess() {
		var todo = new Todo(1, "TODO 2", "DESC TODO 2", true, 1);

		webTestClient
		.put()
		.uri("/todos")
		.bodyValue(todo)
		.exchange()
		.expectStatus().isOk()
		.expectBody()
		.jsonPath("$").isArray()
		.jsonPath("$.length").isEqualTo(1)
		.jsonPath("$[0].id").isEqualTo(todo.getId())
		.jsonPath("$[0].nome").isEqualTo(todo.getNome())
		.jsonPath("$[0].descricao").isEqualTo(todo.getDescricao())
		.jsonPath("$[0].realizado").isEqualTo(todo.isRealizado())
		.jsonPath("$[0].prioridade").isEqualTo(todo.getPrioridade());
	}*/

}
