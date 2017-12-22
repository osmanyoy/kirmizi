package com.metod.ws.ws;

import javax.jws.Oneway;
import javax.jws.WebService;

@WebService

public class WSObject {

    @Oneway
    public void testVoid() {

    }

    public String helloWorld(final String name) {
        return "hello world " + name;
    }
}
