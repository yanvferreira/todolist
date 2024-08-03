package br.com.yanferreira.todolist.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.yanferreira.todolist.entity.Todo;
import br.com.yanferreira.todolist.service.TodoService;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    List<Todo> create(Todo todo){
        return todoService.create(todo);
    }

    List<Todo> list(){
        return todoService.list();
    }

    List<Todo> update(Todo todo){
        return todoService.update(todo);
    }

    List<Todo> delete(Long id){
        return todoService.delete(id);
    }

}
