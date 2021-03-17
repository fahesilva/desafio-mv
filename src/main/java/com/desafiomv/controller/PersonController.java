package com.desafiomv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.desafiomv.models.Person;
import com.desafiomv.services.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonService personService;

	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@Transactional(rollbackFor = Exception.class)
	public ResponseEntity<Person> save(@RequestBody Person person) {
		personService.save(person);
		return new ResponseEntity<>(person, HttpStatus.CREATED);
	}

	@RequestMapping( value = "/{documentNumber}", method = RequestMethod.GET )
	  @Transactional( readOnly = true )
	  public ResponseEntity<Person> findByDocumentNumber( @PathVariable("documentNumber") String documentNumber ){
	      Person person = personService.findByDocumentNumber( documentNumber );
	    if( person == null){
	      return new ResponseEntity<Person>(HttpStatus.NOT_FOUND);
	    }
	    return new ResponseEntity<>( person, HttpStatus.OK );
	  }

}