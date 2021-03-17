package com.desafiomv.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafiomv.models.Person;
import com.desafiomv.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

	public void save(Person person) {
		personRepository.save(person);

	}

	public Person findByDocumentNumber(String documentNumber) {
		return personRepository.findByDocumentNumber(documentNumber);

	}
}
