package com.curiousoft.sample.service.impl;

import com.curiousoft.sample.model.Person;
import com.curiousoft.sample.repo.PersonRepo;
import com.curiousoft.sample.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {


    private PersonRepo personRepo;

    @Autowired
    public PersonServiceImpl(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    @Override
    public boolean exists(Person person) {
        return personRepo.exists(Example.of(person));
    }

    @Override
    public Person addPerson(Person person) {
        //more business logic can me added here
        return personRepo.save(person);
    }

    @Override
    public Person deleteByIdNumber(String idNumber) {
        return personRepo.deleteByIdNumber(idNumber);
    }

    @Override
    public Person findById(String idnumber) {
        return personRepo
                .findByIdNumber(idnumber)
                .orElse(null);
    }

    @Override
    public List<Person> findAll() {
        return personRepo.findAll();
    }
}
