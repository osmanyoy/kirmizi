package com.metod.ws.rest.ext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.metod.ws.rest.model.Person;

@Path("/ex")
public class PersonRestEx {

    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public Person testParam(@QueryParam("person") final Person person) {
        return person;
    }

    @GET
    @Path("/header")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public Person testParam2(@HeaderParam("person") final Person person) {
        return person;
    }

    @POST
    @Path("/zip")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public Response testParam3(@Context final HttpServletRequest request,
                               @Context final HttpServletResponse responseServlet,
                               @Context final HttpHeaders headers,
                               @Context final SecurityContext securityContext,
                               final String test) {
        Person person = new Person();
        person.setName("osman");
        person.setSurname("yayci");
        person.setDepartment("aos");
        person.setAge(47);
        return Response.ok(person)
                       .header("zipme",
                               "true")
                       .build();
    }

}
