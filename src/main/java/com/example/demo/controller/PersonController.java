package com.example.demo.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;

@RestController
@RequestMapping("person")
public class PersonController extends AbstractController<Person> {

	public PersonController(PersonRepository repository) {
		super(repository);
	}
	
	
	@PostMapping(value = "/change-lastname/{id}")
	public Optional<Person> updateLastName(@PathVariable("id") String id, @RequestBody String entity) {
		Optional<Person> person = repository.findById(id);
		
		if (person.isPresent()) {
			person.get().setLastName(entity);
			repository.save(person.get());
		}
		
		return person;
	}


}
