package com.cloud.fall.mountains.todo.rest;

import com.cloud.fall.mountains.todo.entity.Todo;
import com.cloud.fall.mountains.todo.repository.TodoRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;

import java.util.List;

@Endpoint
@AnonymousAllowed
public class TodoEndpoint {

    private final TodoRepository todoRepository;

    public TodoEndpoint(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    public Todo add(String task) {
        return todoRepository.save(new Todo(task));
    }

    public Todo update(Todo todo) {
        return todoRepository.save(todo);
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}
