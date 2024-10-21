package com.cloud.fall.mountains.todo.repository;

import com.cloud.fall.mountains.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
