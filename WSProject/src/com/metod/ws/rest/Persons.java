package com.metod.ws.rest;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.metod.ws.rest.model.Person;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Persons {

    @XmlElement(name = "person")
    private List<Person> persons;

    public List<Person> getPersons() {
        return this.persons;
    }

    public void setPersons(final List<Person> persons) {
        this.persons = persons;
    }

}
