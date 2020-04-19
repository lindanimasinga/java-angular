package com.curiousoft.sample.model;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonTest {


    @Autowired
    private Validator validator;

    @Test
    public void validSAIdNumber() {

        //given id number
        String idnumber = "2501014800085";
        Person person = new Person("Test", "Test", idnumber);

        //when
        Set<ConstraintViolation<Person>> violations = validator.validate(person);

        //no violations, id number is valid
        for(ConstraintViolation<Person> constraintViolation : violations) {
            System.out.println(constraintViolation.getMessage());
        }
        Assert.assertEquals(0, violations.size());
    }

    @Test
    public void invalidSAIdNumber() {

        //given id number
        String idnumber = "2501014800082";
        Person person = new Person("Test", "Test", idnumber);

        //when
        Set<ConstraintViolation<Person>> violations = validator.validate(person);

        //no violations, id number is valid
        for(ConstraintViolation<Person> constraintViolation : violations) {
            System.out.println(constraintViolation.getMessage());
        }
        Assert.assertEquals(1, violations.size());
    }
}