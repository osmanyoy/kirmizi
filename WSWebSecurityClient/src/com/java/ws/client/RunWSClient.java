package com.java.ws.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import javax.xml.ws.BindingProvider;

public class RunWSClient {
    public static void main(final String[] args) throws MalformedURLException {
        HttpsURLConnection.setDefaultHostnameVerifier(new MyHostnameVerifier());
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump",
                           "true");
        // System.setProperty("javax.net.ssl.trustStore","c:\\tomcat\\keystore");
        // System.setProperty("javax.net.ssl.trustStorePassword","12345678");

        WSSecurityService wsSecurityService = new WSSecurityService(new URL("http://127.0.0.1:4040/WSWebSecurity/securehello?wsdl"));
        WSSecurity wsSecurityPort = wsSecurityService.getWSSecurityPort();

        BindingProvider bProvider = (BindingProvider) wsSecurityPort;
        bProvider.getRequestContext()
                 .put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                      "http://127.0.0.1:4040//WSWebSecurity/securehello");
        String secureHello = wsSecurityPort.secureHello();
        System.out.println(secureHello);
    }
}
