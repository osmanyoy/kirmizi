package com.metod.ws.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Result<T> {
    private T t;
    private boolean errorOccured;
    private ErrorObject errorObject;

    public T getT() {
        return this.t;
    }

    public void setT(final T t) {
        this.t = t;
    }

    public boolean isErrorOccured() {
        return this.errorOccured;
    }

    public void setErrorOccured(final boolean errorOccured) {
        this.errorOccured = errorOccured;
    }

    public ErrorObject getErrorObject() {
        return this.errorObject;
    }

    public void setErrorObject(final ErrorObject errorObject) {
        this.errorObject = errorObject;
    }

}
