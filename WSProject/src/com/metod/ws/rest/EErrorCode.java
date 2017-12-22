package com.metod.ws.rest;

public enum EErrorCode implements IError {

    ERROR1("Error1 TXT") {
        @Override
        public ErrorObject getError(final int code) {
            ErrorObject errorObject = new ErrorObject();
            errorObject.setErrorMessage(this.getMsg());
            errorObject.setErrorCode(code);
            errorObject.setErrorCause(100);
            return errorObject;
        }
    },
    ERROR2("Error2 TXT") {
        @Override
        public ErrorObject getError(final int code) {
            ErrorObject errorObject = new ErrorObject();
            errorObject.setErrorMessage(this.getMsg());
            errorObject.setErrorCode(code);
            errorObject.setErrorCause(100);
            return errorObject;

        }
    },
    ERROR3("Error3 TXT") {
        @Override
        public ErrorObject getError(final int code) {
            ErrorObject errorObject = new ErrorObject();
            errorObject.setErrorMessage(this.getMsg());
            errorObject.setErrorCode(code);
            errorObject.setErrorCause(100);
            return errorObject;

        }

        @Override
        public String convertError(final IError error) {
            return "hello";

        }
    }

    ;
    private String msg;

    private EErrorCode(final String msg) {
        this.msg = msg;

    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(final String msg) {
        this.msg = msg;
    }

    public String convertError(final IError error) {
        ErrorObject error3 = error.getError(100);
        return error3.getErrorMessage();
    }
}
