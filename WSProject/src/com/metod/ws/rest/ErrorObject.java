package com.metod.ws.rest;

import java.util.Base64;

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

    public static void main(final String[] args) {
        System.out.println(new String(Base64.getDecoder()
                                            .decode("b3NtYW46b3NtYW4xMg==")));
    }
}
