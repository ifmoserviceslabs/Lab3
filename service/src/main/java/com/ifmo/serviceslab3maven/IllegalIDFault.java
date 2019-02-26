package com.ifmo.serviceslab3maven;

public class IllegalIDFault {
    private static final String DEFAULT_MESSAGE = "Employee with given ID does not exist";
    protected String message;
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }

    public static IllegalIDFault defaultInstance() {
        IllegalIDFault fault = new IllegalIDFault();
        fault.message = DEFAULT_MESSAGE;
        return fault;
    }
}
