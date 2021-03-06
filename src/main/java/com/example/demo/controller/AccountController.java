package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Account;
import com.example.demo.repository.AccountRepository;

@RestController
@RequestMapping("account")
public class AccountController extends AbstractController<Account> {

	public AccountController(AccountRepository repository) {
		super(repository);
	}

}
