package com.practise.drools.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practise.drools.model.Person;

@Component
public class PersonService {
	
	@Autowired
	KieContainer container;
	
	public Person greetPerson(Person person) {
		KieSession kSession = container.newKieSession();
		kSession.insert(person);
		kSession.fireAllRules();
		return person;
	}
	
}
