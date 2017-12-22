package com.metod.ws.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Adress {

    @Id
    @GeneratedValue
    private long addId;
    private String street;
    private String district;
    private String town;
    private String city;

    public String getStreet() {
        return this.street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(final String district) {
        this.district = district;
    }

    public String getTown() {
        return this.town;
    }

    public void setTown(final String town) {
        this.town = town;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

}
