package com.example.client.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class XMLMain {

    public static void main(final String[] args) throws Exception {
        Car car = new Car();
        car.setModel("520i");
        car.setName("BMW");
        car.setHorsePower(170);

        JAXBContext context = JAXBContext.newInstance(Car.class);
        Marshaller createMarshaller = context.createMarshaller();
        createMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
                                     Boolean.TRUE);
        createMarshaller.marshal(car,
                                 System.out);

    }

}
