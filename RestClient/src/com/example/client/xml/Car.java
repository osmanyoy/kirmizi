package com.example.client.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "araba", namespace = "http://common.adenon.com/models")
@XmlType(name = "CarObject", propOrder = { "model", "name", "horsePower" })
@XmlAccessorType(XmlAccessType.FIELD)
public class Car {
    @XmlElement(name = "brand")
    private String model;
    private String name;
    private int horsePower;

    public String getModel() {
        return this.model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public void setHorsePower(final int horsePower) {
        this.horsePower = horsePower;
    }

}
