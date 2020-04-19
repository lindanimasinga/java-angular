package com.curiousoft.sample.service.impl;

import com.curiousoft.sample.model.Person;
import com.curiousoft.sample.repo.PersonRepo;
import com.curiousoft.sample.service.PersonService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class PersonServiceImplTest {

    @Mock
    private PersonRepo personRepo;

    private PersonService sut;

    @Before
    public void setUp() {
        sut = new PersonServiceImpl(personRepo);
    }

    @Test
    public void addPerson() {

        //given a person
        Person person = new Person("Test", "User", "2501014800085");

        //when
        when(personRepo.save(person)).thenReturn(person);

        //system under test
        sut.addPerson(person);

        //verify
        verify(personRepo).save(person);
    }

    @Test
    public void deleteByIdNumber() {
        //given a person
        Person person = new Person("Test", "User", "2501014800085");

        //system under test
        sut.addPerson(person);

        //verify
        verify(personRepo).save(person);
    }
}