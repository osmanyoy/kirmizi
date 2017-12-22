package com.example.client.test;

import javax.xml.ws.BindingProvider;

public class ClientMain {
    public static void main(final String[] args) {
        MyWebserviceService service = new MyWebserviceService();
        MyWebservice myWebservice = service.getMyWebservicePort();
        BindingProvider bindingProvider = (BindingProvider) myWebservice;
        bindingProvider.getRequestContext()
                       .put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                            "http://127.0.0.1:5050/xyz");
        bindingProvider.getRequestContext()
                       .put(BindingProvider.USERNAME_PROPERTY,
                            "osman");
        bindingProvider.getRequestContext()
                       .put(BindingProvider.PASSWORD_PROPERTY,
                            "osman12");
        bindingProvider.getRequestContext()
                       .put("javax.xml.ws.client.connectionTimeout",
                            "6000");
        bindingProvider.getRequestContext()
                       .put("javax.xml.ws.client.receiveTimeout",
                            "1000");

        try {
            CarObject saveCar = myWebservice.saveCar(1200);
            System.out.println(saveCar);
        } catch (MyWebServiceException_Exception e) {
            e.printStackTrace();
        }
    }
}
