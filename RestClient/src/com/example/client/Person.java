package com.example.client;

public class Person {

    private long personId;
    private String name;
    private String surname;
    private int age;

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

    public long getPersonId() {
        return this.personId;
    }

    public void setPersonId(final long personId) {
        this.personId = personId;
    }

}
