package com.example.demo.entity;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Document(collection = "person")
@Data
public class Person implements IdEntity {

	@Id
	private String id;
	private String firstName, lastName;
	private LocalDate dateOfBirth;
	private String idNumber;
	
	@DBRef
	@JsonManagedReference
	private List<Account> accounts;
	
	@DBRef
	private Person dependent;
}
