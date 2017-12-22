package com.example.client;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.metod.ws.rest.model.Person;
import com.metod.ws.rest.model.Persons;
import com.metod.ws.rest.model.Result;

@Path("/person")
public interface IPersonRest {
    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public Person getPerson(@QueryParam("id") final long personId);

    @GET
    @Path("/all")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public Persons getPersons();

    @DELETE
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public Result<String> delete(@QueryParam("id") final long personId);

    @POST
    @Path("/update")
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Person update(final Person person);

    @PUT
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Person save(final Person person);

    @PUT
    @Path("/custom")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Person save2(final Person person);

}
