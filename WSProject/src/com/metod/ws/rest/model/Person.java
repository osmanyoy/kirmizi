package com.metod.ws.rest.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@Table(name = "kisi", indexes = { @Index(columnList = "isim,surname", unique = true) })
public class Person {

    @Id
    @GeneratedValue
    private long personId;

    @NotNull
    @Size(min = 4, message = "isim 4 karakterden küçük olamaz")
    @PathParam("isim")
    @Column(name = "isim", length = 50, nullable = false, unique = true)
    private String name;

    @HeaderParam("soyisim")
    private String surname;

    @Min(10)
    @Max(150)
    @QueryParam("yas")
    private int age;

    @Size(min = 1, message = "Þehir en az bir tane olmalý")
    @MatrixParam("sehir")
    // @OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> cities;

    @QueryParam("bolum")
    private String department;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
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
