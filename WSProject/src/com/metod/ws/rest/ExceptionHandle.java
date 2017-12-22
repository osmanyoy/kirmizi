package com.metod.ws.rest;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ExceptionHandle implements ExceptionMapper<MyException> {

    @Override
    public Response toResponse(final MyException exception) {
        ErrorObject errorObject = new ErrorObject();
        errorObject.setErrorMessage(exception.getMsg());
        errorObject.setErrorCode(exception.getCode());
        errorObject.setErrorCause(exception.getCauseCode());
        Response response = Response.status(Status.BAD_REQUEST)
                                    .entity(errorObject)
                                    .build();
        return response;
    }

}
