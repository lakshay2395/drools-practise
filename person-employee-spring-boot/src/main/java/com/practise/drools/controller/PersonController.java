package com.practise.drools.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practise.drools.model.Person;
import com.practise.drools.service.PersonService;

@RestController("/person")
public class PersonController {
	
	@Autowired
	PersonService service;
	
	@RequestMapping(path="/greet",method=RequestMethod.POST)
	public Person greetPerson(@RequestBody Person person) {
		return service.greetPerson(person);
	}

}
