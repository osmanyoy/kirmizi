package com.metod.ws.rest.model;

public class ErrorObject {
    private String errorMessage;
    private int errorCode;
    private int errorCause;

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(final String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(final int errorCode) {
        this.errorCode = errorCode;
    }

    public int getErrorCause() {
        return this.errorCause;
    }

    public void setErrorCause(final int errorCause) {
        this.errorCause = errorCause;
    }

}
