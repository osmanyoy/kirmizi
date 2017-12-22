package com.metod.ws.rest;

import java.security.Principal;
import java.util.List;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.servlet.ServletRequest;
import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.jboss.security.annotation.SecurityDomain;

import com.metod.ws.ejb.PersonDAO;
import com.metod.ws.ejb.TestSecurity;
import com.metod.ws.rest.model.Person;

@Path("/first")
@SecurityDomain("ApplicationRealm")
@PermitAll
public class MyFirstRest {

    @EJB
    private TestSecurity sec;

    @EJB
    private PersonDAO personDAO;

    @GET
    @RolesAllowed("admin")
    public String hello(@Context final ServletRequest servletRequest,
                        @Context final SecurityContext context) {
        Principal userPrincipal = context.getUserPrincipal();
        System.out.println(userPrincipal);
        String hello = this.sec.hello();
        return hello;
    }

    @POST
    public String hello3() {
        return "hello world 3";
    }

    @DELETE
    public String hello4() {
        return "hello world 4";
    }

    @GET
    @Path("/hello2")
    public String hello2() {
        return "hello world 2";
    }

    @GET
    @Path("/hello5")
    public String hello5(@QueryParam("isim") final String name,
                         @QueryParam("soyisim") final String surname) {
        return "hello world 5 : " + name + " " + surname;
    }

    @GET
    @Path("/hello6/{isim}/{soyisim}")
    public String hello6(@PathParam("isim") final String name,
                         @PathParam("soyisim") final String surname) {
        return "hello world 6 : " + name + " " + surname;
    }

    @GET
    @Path("/hello7/{isim}/{soyisim}")
    public String hello7(@PathParam("isim") final String name,
                         @PathParam("soyisim") final String surname,
                         @QueryParam("yas") final int age) {
        return "hello world 7 : " + name + " " + surname + " age : " + age;
    }

    @GET
    @Path("/hello8/{isim}")
    public String hello8(@PathParam("isim") final String name,
                         @HeaderParam("soyisim") final String surname,
                         @QueryParam("yas") final int age) {
        return "hello world 8 : " + name + " " + surname + " age : " + age;
    }

    @GET
    @Path("/hello9/{isim}")
    public String hello9(@PathParam("isim") final String name,
                         @HeaderParam("soyisim") final String surname,
                         @QueryParam("yas") final int age,
                         @MatrixParam("sehir") final String city) {
        return "hello world 9 : " + name + " " + surname + " age : " + age + " city : " + city;
    }

    @GET
    @Path("/hello9a/{isim}")
    public String hello9a(@PathParam("isim") final String name,
                          @HeaderParam("soyisim") final String surname,
                          @QueryParam("yas") final int age,
                          @MatrixParam("sehir") final List<String> city) {
        return "hello world 9a : " + name + " " + surname + " age : " + age + " city : " + city;
    }

    @GET
    @Path("/hello9b/{isim}")
    public String hello9b(@PathParam("isim") final String name,
                          @HeaderParam("soyisim") final String surname,
                          @QueryParam("yas") final int age,
                          @MatrixParam("sehir") final List<String> city,
                          @CookieParam("bolum") final String department) {
        return "hello world 9b : " + name + " " + surname + " age : " + age + " city : " + city + " department : "
                + department;
    }

    @GET
    @Path("/hello9c/{isim}")
    public String hello9b(@BeanParam final Person person) {
        return "hello world 9c : " + person.getName() + " " + person.getSurname() + " age : " + person.getAge()
                + " city : " + person.getCities() + " department : " + person.getDepartment();
    }

    @POST
    @Path("/hello9d/{isim}")
    public String hello9d(@PathParam("isim") final String name,
                          @FormParam("soyisim") final String surname,
                          @FormParam("yas") final int age,
                          @FormParam("sehir") final List<String> city,
                          @FormParam("bolum") final String department) {
        return "hello world 9d : " + name + " " + surname + " age : " + age + " city : " + city + " department : "
                + department;
    }

    @POST
    @Path("/hello9e")
    @Consumes(MediaType.APPLICATION_JSON)
    public String hello9e(final Person person) {
        return "hello world 9e : " + person.getName() + " " + person.getSurname() + " age : " + person.getAge()
                + " city : " + person.getCities() + " department : " + person.getDepartment();
    }

    @POST
    @Path("/hello9f")
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Person hello9f(final Person person) {
        person.setName("My name : " + person.getName());
        return person;
    }

    @POST
    @Path("/hello9g")
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Person hello9g(final Person person) {
        if (person.getAge() < 10) {
            ErrorObject errorObject = new ErrorObject();
            errorObject.setErrorMessage("Yas problemi : yas 10 dan küçük olamaz");
            errorObject.setErrorCode(100);
            errorObject.setErrorCause(3);
            Response response = Response.status(Status.CONFLICT)
                                        .entity(errorObject)
                                        .build();
            throw new WebApplicationException(response);
            // throw new IllegalArgumentException("age 10 dan kucuk olamaz");
        }
        person.setName("My name : " + person.getName());
        return person;
    }

    @POST
    @Path("/hello9h")
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response hello9h(final Person person) {
        if (person.getAge() < 10) {
            ErrorObject errorObject = new ErrorObject();
            errorObject.setErrorMessage("Yas problemi : yas 10 dan küçük olamaz");
            errorObject.setErrorCode(100);
            errorObject.setErrorCause(3);
            Response response = Response.status(Status.CONFLICT)
                                        .entity(errorObject)
                                        .build();
            return response;
        }

        person.setName("My name : " + person.getName());
        Response response = Response.status(Status.OK)
                                    .entity(person)
                                    .build();
        return response;
    }

    @POST
    @Path("/hello9i")
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Person hello9i(@Valid final Person person) throws MyException {
        if (person.getAge() < 10) {
            throw new MyException("10 dan küçük",
                                  500,
                                  200);
        }
        this.personDAO.insert(person);
        person.setName("My name : " + person.getName());
        return person;
    }

}
