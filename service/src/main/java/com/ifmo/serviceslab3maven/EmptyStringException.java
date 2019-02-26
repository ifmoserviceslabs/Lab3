package com.ifmo.serviceslab3maven;
import javax.xml.ws.WebFault;


@WebFault(faultBean="com.ifmo.serviceslab3maven.EmptyStringFault")
public class EmptyStringException extends Exception {
    private final EmptyStringFault fault;
    
    public EmptyStringException(String message, EmptyStringFault fault) {
        super(message);
        this.fault = fault;
    }
    
    public EmptyStringException(String message, EmptyStringFault fault, Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }
    
    public EmptyStringFault getFaultInfo() {
        return fault;
    }
}
