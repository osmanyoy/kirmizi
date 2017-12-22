package com.example.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import com.metod.ws.rest.model.Persons;

public class RestClient {
    public static void main2(final String[] args) {
        Client newClient = ClientBuilder.newClient();
        Response method = newClient.target("http://127.0.0.1:6060/hello4")
                                   .request()
                                   .header("name",
                                           "osman")
                                   .method("PUT");
        String readEntity = method.readEntity(String.class);
        System.out.println("read : " + readEntity);

    }

    public static void main(final String[] args) {
        ResteasyClient resteasyClient = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = resteasyClient.target("http://127.0.0.1:7070/WSProject/rest");
        IPersonRest proxy = target.proxy(IPersonRest.class);
        Persons persons = proxy.getPersons();
        System.out.println(persons.getPersons());
    }
}
