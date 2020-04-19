package com.curiousoft.sample.service;

import com.curiousoft.sample.model.Person;

public interface PersonService {

    boolean exists(Person person);

    Person addPerson(Person person);

    Person deleteByIdNumber(String idNumber);

    Person findById(String idnumber);
}
