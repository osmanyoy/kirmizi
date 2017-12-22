
package com.example.client.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for myFaultObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="myFaultObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="detailedMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCause" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "myFaultObject", propOrder = {
    "detailedMessage",
    "errorCause",
    "errorCode"
})
public class MyFaultObject {

    protected String detailedMessage;
    protected int errorCause;
    protected int errorCode;

    /**
     * Gets the value of the detailedMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailedMessage() {
        return detailedMessage;
    }

    /**
     * Sets the value of the detailedMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailedMessage(String value) {
        this.detailedMessage = value;
    }

    /**
     * Gets the value of the errorCause property.
     * 
     */
    public int getErrorCause() {
        return errorCause;
    }

    /**
     * Sets the value of the errorCause property.
     * 
     */
    public void setErrorCause(int value) {
        this.errorCause = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     */
    public void setErrorCode(int value) {
        this.errorCode = value;
    }

}
