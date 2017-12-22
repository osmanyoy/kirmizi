package com.metod.ws.rest;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ValidationExceptionHandle implements ExceptionMapper<ValidationException> {

    @Override
    public Response toResponse(final ValidationException exception) {

        if (exception instanceof ConstraintViolationException) {
            ConstraintViolationException constraintViolationException = (ConstraintViolationException) exception;
            Set<ConstraintViolation<?>> constraintViolations = constraintViolationException.getConstraintViolations();
            String message = "Error : ";
            for (ConstraintViolation<?> constraintViolation : constraintViolations) {
                message += constraintViolation.getMessage() + ",";
            }
            ErrorObject errorObject = new ErrorObject();
            errorObject.setErrorMessage(message);
            errorObject.setErrorCode(100);
            errorObject.setErrorCause(200);
            Response response = Response.status(Status.BAD_REQUEST)
                                        .entity(errorObject)
                                        .build();
            return response;

        }
        ErrorObject errorObject = new ErrorObject();
        errorObject.setErrorMessage(exception.getMessage());
        errorObject.setErrorCode(100);
        errorObject.setErrorCause(200);
        Response response = Response.status(Status.BAD_REQUEST)
                                    .entity(errorObject)
                                    .build();
        return response;
    }

}
