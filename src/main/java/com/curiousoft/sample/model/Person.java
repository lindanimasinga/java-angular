package com.curiousoft.sample.model;

import com.curiousoft.sample.annotation.ValidSAIdNumber;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;


@Entity
@Table(name = "Person")
@EntityListeners(AuditingEntityListener.class)
public class Person {

    @Id
    String Id = UUID.randomUUID().toString();

    @NotEmpty(message = "Name may not be empty")
    @Size(min = 2, max = 32, message = "Name must be between 2 and 32 characters long")
    private String name;

    @NotEmpty(message = "Surname may not be empty")
    @Size(min = 2, max = 32, message = "Name must be between 2 and 32 characters long")
    private String surname;

    @Column(unique = true)
    @ValidSAIdNumber(message = "Invalid south african id number")
    private String idNumber;

    @CreatedDate
    private Date createdDate;

    @LastModifiedDate
    private Date modified;

    public Person() {
    }

    public Person(String name, String surname, String idNumber) {
        this.name = name;
        this.surname = surname;
        this.idNumber = idNumber;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(idNumber, person.idNumber);
    }
}
