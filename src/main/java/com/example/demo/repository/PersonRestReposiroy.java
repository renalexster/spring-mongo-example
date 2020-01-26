package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entity.Person;

@RepositoryRestResource(collectionResourceRel = "pessoa", path = "pessoa")
public interface PersonRestReposiroy extends PagingAndSortingRepository<Person, String> {

}
