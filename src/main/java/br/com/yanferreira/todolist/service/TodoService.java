package br.com.yanferreira.todolist.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.yanferreira.todolist.entity.Todo;
import br.com.yanferreira.todolist.repository.TodoRepository;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(){

    }
    public List<Todo> list(){

    }
    public List<Todo> update(){

    }
    public List<Todo> delete(){

    }

}
