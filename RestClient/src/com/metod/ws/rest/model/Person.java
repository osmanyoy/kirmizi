package com.metod.ws.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {

    private long personId;

    private String name;

    private String surname;

    private int age;

    private List<String> cities;

    private String department;

    private Adress adress;

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public List<String> getCities() {
        return this.cities;
    }

    public void setCities(final List<String> cities) {
        this.cities = cities;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(final String department) {
        this.department = department;
    }

    public Adress getAdress() {
        return this.adress;
    }

    public void setAdress(final Adress adress) {
        this.adress = adress;
    }

    public long getPersonId() {
        return this.personId;
    }

    public void setPersonId(final long personId) {
        this.personId = personId;
    }

}
