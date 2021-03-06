
package com.ifmo.serviceslab3client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "EmptyStringException", targetNamespace = "http://serviceslab3maven.ifmo.com/")
public class EmptyStringException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private EmptyStringFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public EmptyStringException(String message, EmptyStringFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public EmptyStringException(String message, EmptyStringFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.ifmo.serviceslab3maven.EmptyStringFault
     */
    public EmptyStringFault getFaultInfo() {
        return faultInfo;
    }

}
