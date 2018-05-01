package com.example.application.spring.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.application.spring.entity.Todo;
import com.example.application.spring.repository.login.LoginRepository;
import com.example.application.spring.repository.login.TodoRepository;

@Service
@Transactional
public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
	private static int todoCount = 3;

	@Autowired
	private TodoRepository toDoRepository;
	
	static {
		todos.add(new Todo(1, "in28Minutes", "Learn Spring MVC", new Date(), false));
		todos.add(new Todo(2, "in28Minutes", "Learn Struts", new Date(), false));
		todos.add(new Todo(3, "in28Minutes", "Learn Hibernate", new Date(), false));
	}

	public List<Todo> retrieveTodos(String user) {
		
		List<Todo> filteredTodos = new ArrayList<Todo>();
		for (Todo todo : todos) {
			if (todo.getUser().equals(user)) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}

}
