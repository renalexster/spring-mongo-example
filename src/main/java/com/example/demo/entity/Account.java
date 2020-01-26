package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Document(collection = "account")
@Data
public class Account implements IdEntity {
	@Id
	private String id;
	private String number;
	private Float balance;
	@DBRef
	@JsonBackReference
	private Person holder;
}
