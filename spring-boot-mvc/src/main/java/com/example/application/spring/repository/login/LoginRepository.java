package com.example.application.spring.repository.login;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.application.spring.entity.AppUser;

public interface LoginRepository  extends CrudRepository<AppUser, Integer>{ 

	public Iterable<AppUser> findAllByName(Iterable<String> name);
	public Optional<AppUser> findByName(String name);

}
