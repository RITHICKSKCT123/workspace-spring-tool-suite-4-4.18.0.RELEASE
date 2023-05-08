package com.snapchat.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.snapchat.demo.model.Person;
import com.snapchat.demo.service.PersonService;
@RestController
public class PersonController {

	@Autowired
	PersonService pservice;
	
	
	@GetMapping("/getPerson")
	public List<Person> findAll()
	{
		return pservice.getPerson();
	}
	
	@PostMapping("/postPerson")
	public Person addPersons(@RequestBody Person p)
	{
		return pservice.postPerson(p);
	}
}