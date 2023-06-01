package com.zen.springboottodoapplication.repositories;

import com.zen.springboottodoapplication.models.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {  
}
