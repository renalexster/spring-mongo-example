package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.IdEntity;
import com.example.demo.repository.GenericRepository;

public abstract class AbstractController<T extends IdEntity> {
	GenericRepository<T> repository;
	
	public AbstractController(GenericRepository<T> repository) {
		this.repository = repository;
	}

	@GetMapping(value = "/{id}")
	public Optional<T> getPersonById(@PathVariable("id") String id) {
		return repository.findById(id);
	}

	@GetMapping(value = "")
	public List<T> getAllPerson() {
		return repository.findAll();
	}

	@PutMapping(value = "/{id}")
	public Optional<T> update(@PathVariable String id, @RequestBody T entity) {
		return Optional.of(repository.save(entity));
	}

	@PostMapping(value = "")
	public Optional<T> save(@RequestBody Optional<T> entity) {
		return Optional.of(repository.insert(entity.get()));
	}
}
