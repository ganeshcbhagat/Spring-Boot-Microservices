package com.example.application.spring.repository.login;

import org.springframework.data.repository.CrudRepository;

import com.example.application.spring.entity.Todo;

public interface TodoRepository  extends CrudRepository<Todo, Integer>{

}
