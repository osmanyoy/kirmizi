package com.metod.ws.rest.ext;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import com.metod.ws.rest.model.Person;

@Provider
@Produces("osman/txt")
public class MyCustomWriter implements MessageBodyWriter<Person> {

    @Override
    public boolean isWriteable(final Class<?> type,
                               final Type genericType,
                               final Annotation[] annotations,
                               final MediaType mediaType) {
        return true;
    }

    @Override
    public long getSize(final Person t,
                        final Class<?> type,
                        final Type genericType,
                        final Annotation[] annotations,
                        final MediaType mediaType) {
        return 0;
    }

    @Override
    public void writeTo(final Person person,
                        final Class<?> type,
                        final Type genericType,
                        final Annotation[] annotations,
                        final MediaType mediaType,
                        final MultivaluedMap<String, Object> httpHeaders,
                        final OutputStream entityStream) throws IOException, WebApplicationException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(person.getName());
        stringBuilder.append(",");
        stringBuilder.append(person.getSurname());
        stringBuilder.append(",");
        stringBuilder.append(person.getDepartment());
        stringBuilder.append(",");
        stringBuilder.append(person.getAge());
        entityStream.write(stringBuilder.toString()
                                        .getBytes("UTF-8"));
    }

}
