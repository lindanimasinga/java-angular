package com.curiousoft.sample.controller;

import com.curiousoft.sample.service.PersonService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class PersonControllerTest {

    private PersonController sut;

    @Autowired
    private PersonService personService;

    @Before
    public void setUp() throws Exception {
        sut = new PersonController(personService);
    }

    @Test
    void addPersonValidId() {

    }
}