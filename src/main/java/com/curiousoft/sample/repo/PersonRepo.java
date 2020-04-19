package com.curiousoft.sample.repo;

import com.curiousoft.sample.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepo extends JpaRepository<Person, String> {

    Optional<Person> findByIdNumber(String name);

    Person deleteByIdNumber(String idNumber);
}
