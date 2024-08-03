package br.com.yanferreira.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.yanferreira.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
