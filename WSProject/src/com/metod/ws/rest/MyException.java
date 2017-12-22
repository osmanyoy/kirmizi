package com.metod.ws.rest;

public class MyException extends Exception {
    /**
     * 
     */
    private static final long serialVersionUID = 6371549224880695741L;
    private String msg;
    private int code;
    private int causeCode;

    public MyException(final String msg, final int code, final int cause) {
        super();
        this.msg = msg;
        this.code = code;
        this.causeCode = cause;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(final String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(final int code) {
        this.code = code;
    }

    public int getCauseCode() {
        return this.causeCode;
    }

    public void setCauseCode(final int cause) {
        this.causeCode = cause;
    }

}
