package com.ifmo.serviceslab3maven;
import javax.xml.ws.WebFault;


@WebFault(faultBean="com.ifmo.serviceslab3maven.IllegalIDFault")
public class IllegalIDException extends Exception {
    private final IllegalIDFault fault;
    
    public IllegalIDException(String message, IllegalIDFault fault) {
        super(message);
        this.fault = fault;
    }
    
    public IllegalIDException(String message, IllegalIDFault fault, Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }
    
    public IllegalIDFault getFaultInfo() {
        return fault;
    }
}
