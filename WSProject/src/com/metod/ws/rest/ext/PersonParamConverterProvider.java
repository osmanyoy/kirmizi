package com.metod.ws.rest.ext;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

import com.metod.ws.rest.model.Person;

@Provider
public class PersonParamConverterProvider implements ParamConverterProvider {

    private ParamConverter<Person> ppc = new PersonParamConverter();

    @Override
    public <T> ParamConverter<T> getConverter(final Class<T> rawType,
                                              final Type genericType,
                                              final Annotation[] annotations) {
        if (rawType.equals(Person.class)) {
            return (ParamConverter<T>) this.ppc;
        }
        return null;
    }

}
