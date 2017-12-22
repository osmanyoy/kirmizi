package com.example.client.xml;

import javax.xml.ws.Endpoint;

public class WebServiceMain {
    public static void main(final String[] args) {
        Endpoint.publish("http://127.0.0.1:9999/ws",
                         new MyWebservice());
    }
}
