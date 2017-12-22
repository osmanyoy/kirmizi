package com.metod.ws.rest.ext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

import com.metod.ws.rest.model.Person;

@Provider
@Consumes("osman/txt")
public class MyCustomReader implements MessageBodyReader<Person> {

    @Override
    public boolean isReadable(final Class<?> type,
                              final Type genericType,
                              final Annotation[] annotations,
                              final MediaType mediaType) {
        return true;
    }

    @Override
    public Person readFrom(final Class<Person> type,
                           final Type genericType,
                           final Annotation[] annotations,
                           final MediaType mediaType,
                           final MultivaluedMap<String, String> httpHeaders,
                           final InputStream entityStream) throws IOException, WebApplicationException {
        Reader reader = new InputStreamReader(entityStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String readLine = bufferedReader.readLine();
        String[] split = readLine.split(",");
        Person person = new Person();
        person.setName(split[0]);
        person.setSurname(split[1]);
        person.setDepartment(split[2]);
        person.setAge(Integer.parseInt(split[3]));
        return person;
    }

}
