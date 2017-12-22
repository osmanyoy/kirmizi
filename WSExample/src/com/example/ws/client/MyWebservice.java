package com.example.ws.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService(targetNamespace = "http://sms.adenon.com/dbop")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public class MyWebservice {

    @WebMethod(operationName = "findCar")
    @WebResult(name = "car", partName = "carPart")
    public Car getCar() {
        Car car = new Car();
        car.setModel("520i");
        car.setName("BMW");
        car.setHorsePower(170);
        return car;
    }

    // @WebResult(name = "car", partName = "carPart")
    // public Car saveCar(@WebParam(name = "carId") final long id,
    // @WebParam(name = "carBrand") final String name) {
    // Car car = new Car();
    // car.setModel("520i");
    // car.setName("BMW");
    // car.setHorsePower(170);
    // return car;
    // }
    @WebMethod(action = "saveCar")
    @WebResult(name = "car", partName = "carPart")
    public Car saveCar(@WebParam(name = "carId") final long id) throws MyWebServiceException {
        if (id > 1000) {
            throw new MyWebServiceException("id problemi",
                                            new MyFaultObject("id 1000 den büyük olamaz",
                                                              100,
                                                              1000));
        }
        Car car = new Car();
        car.setModel("520i");
        car.setName("BMW");
        car.setHorsePower(170);
        return car;
    }

    @WebMethod(action = "deleteCar")
    @WebResult(name = "car", partName = "carPart")
    public Car deleteCar(@WebParam(name = "carId") final long id) {
        Car car = new Car();
        car.setModel("520i");
        car.setName("BMW");
        car.setHorsePower(170);
        return car;
    }

    @WebMethod(exclude = true)
    public Car saveCar2(final long id,
                        final String name) {
        return null;
    }

}
