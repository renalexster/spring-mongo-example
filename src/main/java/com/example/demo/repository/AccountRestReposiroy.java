package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entity.Account;

@RepositoryRestResource(collectionResourceRel = "conta", path = "conta")
public interface AccountRestReposiroy extends PagingAndSortingRepository<Account, String> {

}
