
package com.java.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.java.ws.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SecureHelloResponse_QNAME = new QName("http://security.ws.java.com/", "secureHelloResponse");
    private final static QName _SecureHello_QNAME = new QName("http://security.ws.java.com/", "secureHello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.java.ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SecureHelloResponse }
     * 
     */
    public SecureHelloResponse createSecureHelloResponse() {
        return new SecureHelloResponse();
    }

    /**
     * Create an instance of {@link SecureHello }
     * 
     */
    public SecureHello createSecureHello() {
        return new SecureHello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecureHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://security.ws.java.com/", name = "secureHelloResponse")
    public JAXBElement<SecureHelloResponse> createSecureHelloResponse(SecureHelloResponse value) {
        return new JAXBElement<SecureHelloResponse>(_SecureHelloResponse_QNAME, SecureHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecureHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://security.ws.java.com/", name = "secureHello")
    public JAXBElement<SecureHello> createSecureHello(SecureHello value) {
        return new JAXBElement<SecureHello>(_SecureHello_QNAME, SecureHello.class, null, value);
    }

}
