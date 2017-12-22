
package com.example.client.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.client.test package. 
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

    private final static QName _FindCar_QNAME = new QName("http://sms.adenon.com/dbop", "findCar");
    private final static QName _MyFaultObject_QNAME = new QName("http://sms.adenon.com/dbop", "myFaultObject");
    private final static QName _DeleteCarResponse_QNAME = new QName("http://sms.adenon.com/dbop", "deleteCarResponse");
    private final static QName _MyWebServiceException_QNAME = new QName("http://sms.adenon.com/dbop", "MyWebServiceException");
    private final static QName _DeleteCar_QNAME = new QName("http://sms.adenon.com/dbop", "deleteCar");
    private final static QName _SaveCar_QNAME = new QName("http://sms.adenon.com/dbop", "saveCar");
    private final static QName _SaveCarResponse_QNAME = new QName("http://sms.adenon.com/dbop", "saveCarResponse");
    private final static QName _Araba_QNAME = new QName("http://common.adenon.com/models", "araba");
    private final static QName _FindCarResponse_QNAME = new QName("http://sms.adenon.com/dbop", "findCarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.client.test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CarObject }
     * 
     */
    public CarObject createCarObject() {
        return new CarObject();
    }

    /**
     * Create an instance of {@link FindCarResponse }
     * 
     */
    public FindCarResponse createFindCarResponse() {
        return new FindCarResponse();
    }

    /**
     * Create an instance of {@link SaveCarResponse }
     * 
     */
    public SaveCarResponse createSaveCarResponse() {
        return new SaveCarResponse();
    }

    /**
     * Create an instance of {@link DeleteCar }
     * 
     */
    public DeleteCar createDeleteCar() {
        return new DeleteCar();
    }

    /**
     * Create an instance of {@link SaveCar }
     * 
     */
    public SaveCar createSaveCar() {
        return new SaveCar();
    }

    /**
     * Create an instance of {@link MyWebServiceException }
     * 
     */
    public MyWebServiceException createMyWebServiceException() {
        return new MyWebServiceException();
    }

    /**
     * Create an instance of {@link DeleteCarResponse }
     * 
     */
    public DeleteCarResponse createDeleteCarResponse() {
        return new DeleteCarResponse();
    }

    /**
     * Create an instance of {@link FindCar }
     * 
     */
    public FindCar createFindCar() {
        return new FindCar();
    }

    /**
     * Create an instance of {@link MyFaultObject }
     * 
     */
    public MyFaultObject createMyFaultObject() {
        return new MyFaultObject();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sms.adenon.com/dbop", name = "findCar")
    public JAXBElement<FindCar> createFindCar(FindCar value) {
        return new JAXBElement<FindCar>(_FindCar_QNAME, FindCar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MyFaultObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sms.adenon.com/dbop", name = "myFaultObject")
    public JAXBElement<MyFaultObject> createMyFaultObject(MyFaultObject value) {
        return new JAXBElement<MyFaultObject>(_MyFaultObject_QNAME, MyFaultObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sms.adenon.com/dbop", name = "deleteCarResponse")
    public JAXBElement<DeleteCarResponse> createDeleteCarResponse(DeleteCarResponse value) {
        return new JAXBElement<DeleteCarResponse>(_DeleteCarResponse_QNAME, DeleteCarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MyWebServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sms.adenon.com/dbop", name = "MyWebServiceException")
    public JAXBElement<MyWebServiceException> createMyWebServiceException(MyWebServiceException value) {
        return new JAXBElement<MyWebServiceException>(_MyWebServiceException_QNAME, MyWebServiceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sms.adenon.com/dbop", name = "deleteCar")
    public JAXBElement<DeleteCar> createDeleteCar(DeleteCar value) {
        return new JAXBElement<DeleteCar>(_DeleteCar_QNAME, DeleteCar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveCar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sms.adenon.com/dbop", name = "saveCar")
    public JAXBElement<SaveCar> createSaveCar(SaveCar value) {
        return new JAXBElement<SaveCar>(_SaveCar_QNAME, SaveCar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveCarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sms.adenon.com/dbop", name = "saveCarResponse")
    public JAXBElement<SaveCarResponse> createSaveCarResponse(SaveCarResponse value) {
        return new JAXBElement<SaveCarResponse>(_SaveCarResponse_QNAME, SaveCarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.adenon.com/models", name = "araba")
    public JAXBElement<CarObject> createAraba(CarObject value) {
        return new JAXBElement<CarObject>(_Araba_QNAME, CarObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sms.adenon.com/dbop", name = "findCarResponse")
    public JAXBElement<FindCarResponse> createFindCarResponse(FindCarResponse value) {
        return new JAXBElement<FindCarResponse>(_FindCarResponse_QNAME, FindCarResponse.class, null, value);
    }

}
