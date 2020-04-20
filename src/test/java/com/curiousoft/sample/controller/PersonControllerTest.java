package com.curiousoft.sample.controller;

import com.curiousoft.sample.model.Person;
import com.curiousoft.sample.repo.PersonRepo;
import com.curiousoft.sample.service.PersonService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonControllerTest {

    private PersonController sut;

    @Autowired
    private PersonService personService;
    @Autowired
    private PersonRepo personRepo;

    @Before
    public void setUp() throws Exception {
        sut = new PersonController(personService);
    }

    @Test
    public void addPerson() {
        //given
        String id = "4906155800083";
        Person person = new Person("Test", "User", id);

        //test
        sut.addPerson(person);

        //verify
        Assert.assertEquals(personRepo.findByIdNumber(id).get(), person);
    }

    @Test
    public void getAllPersons() {
        //given
        String id = "4911155800083";
        Person person = new Person("Test", "User", id);

        //test
        sut.addPerson(person);

        //verify
        Assert.assertTrue(personRepo.findAll().size() > 0);
    }

    @Test
    public void invalidIdNumber() {

        try {
            //given
            String id = "4911155800081";
            Person person = new Person("Test", "User", id);
            //test
            sut.addPerson(person);
            Assert.fail();
        } catch (Exception e) {
            //verify
            Assert.assertTrue(true);
        }
    }
}