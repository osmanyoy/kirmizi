package com.metod.ws.rest.ext;

import javax.ws.rs.ext.ParamConverter;

import com.metod.ws.rest.model.Person;

public class PersonParamConverter implements ParamConverter<Person> {

    @Override
    public Person fromString(final String value) {
        String[] split = value.split(":");
        Person person = new Person();
        person.setName(split[0]);
        person.setSurname(split[1]);
        person.setDepartment(split[2]);
        person.setAge(Integer.parseInt(split[3]));
        return person;
    }

    @Override
    public String toString(final Person value) {
        return value.getName() + ":" + value.getSurname() + ":" + value.getDepartment() + ":" + value.getAge();
    }

}
