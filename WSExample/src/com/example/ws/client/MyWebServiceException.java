package com.example.ws.client;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.ws.WebFault;

@WebFault
@XmlRootElement
public class MyWebServiceException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 3219604863836062941L;

    private MyFaultObject fault;

    public MyWebServiceException(final String message, final MyFaultObject fault) {
        super(message);
        this.setFault(fault);
    }

    public MyFaultObject getFault() {
        return this.fault;
    }

    public void setFault(final MyFaultObject fault) {
        this.fault = fault;
    }
}
