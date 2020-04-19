package com.curiousoft.sample.controller;

import com.curiousoft.sample.annotation.ValidSAIdNumber;
import com.curiousoft.sample.model.Person;
import com.curiousoft.sample.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api")
public class PersonController {

    @Autowired
    private PersonService personService;

    public PersonController() {
    }

    public PersonController(PersonService personService) {
    }

    @RequestMapping(value = "/person", method = RequestMethod.POST,
            consumes = "application/json", produces = "application/json")
    public ResponseEntity addPerson(@RequestBody @Valid Person person) {
        personService.addPerson(person);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/person/{idnumber}", method = RequestMethod.GET,
            consumes = "application/json", produces = "application/json")
    public ResponseEntity<Person> addPerson(@PathVariable @ValidSAIdNumber String idnumber) {

        Person persistedPerson = personService.findById(idnumber);
        return persistedPerson != null ? ResponseEntity.ok(persistedPerson) : ResponseEntity.notFound().build();
    }

    @RequestMapping(value = "/person/{idnumber}", method = RequestMethod.DELETE,
            consumes = "application/json", produces = "application/json")
    public ResponseEntity<Person> deletePerson(@PathVariable @ValidSAIdNumber String idnumber) {

        Person persistedPerson = personService.deleteByIdNumber(idnumber);
        return persistedPerson != null ? ResponseEntity.ok(persistedPerson) : ResponseEntity.notFound().build();
    }
}
