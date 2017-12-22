package com.example.client.xml;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyFaultObject {
    private String detailedMessage;
    private int errorCode;
    private int errorCause;

    public MyFaultObject() {
    }

    public MyFaultObject(final String detailedMessage, final int errorCode, final int errorCause) {
        super();
        this.detailedMessage = detailedMessage;
        this.errorCode = errorCode;
        this.errorCause = errorCause;
    }

    public String getDetailedMessage() {
        return this.detailedMessage;
    }

    public void setDetailedMessage(final String detailedMessage) {
        this.detailedMessage = detailedMessage;
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
