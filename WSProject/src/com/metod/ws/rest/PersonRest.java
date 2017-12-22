package com.metod.ws.rest;

import javax.ejb.EJB;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.metod.ws.ejb.PersonDAO;
import com.metod.ws.rest.model.Person;

@Path("/person")
public class PersonRest {

    @EJB
    private PersonDAO personDAO;

    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public Person getPerson(@QueryParam("id") final long personId) {
        return this.personDAO.getPerson(personId);
    }

    @GET
    @Path("/all")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public Persons getPersons() {
        Persons persons = new Persons();
        persons.setPersons(this.personDAO.getAllPerson());
        return persons;
    }

    @DELETE
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public Result<String> delete(@QueryParam("id") final long personId) throws MyException {
        Person person = this.personDAO.getPerson(personId);
        if (person != null) {
            this.personDAO.delete(person);
        }

        Result<String> result = new Result<>();
        result.setErrorOccured(false);
        result.setT("Successfully deleted");
        return result;
    }

    @POST
    @Path("update")
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Person update(@Valid final Person person) throws MyException {
        if (person.getAge() < 10) {
            throw new MyException("10 dan küçük",
                                  500,
                                  200);
        }
        this.personDAO.update(person);
        person.setName("My name : " + person.getName());
        return person;
    }

    @PUT
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Person save(@Valid final Person person) throws MyException {
        if (person.getAge() < 10) {
            throw new MyException("10 dan küçük",
                                  500,
                                  200);
        }
        this.personDAO.insert(person);

        person.setName("My name : " + person.getName());
        return person;
    }

    @PUT
    @Path("custom")
    @Consumes({ "osman/txt" })
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, "osman/txt" })
    public Person save2(@Valid final Person person) throws MyException {
        this.personDAO.insert(person);
        return person;
    }

}
