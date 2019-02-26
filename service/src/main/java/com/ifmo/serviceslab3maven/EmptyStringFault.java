package com.ifmo.serviceslab3maven;

public class EmptyStringFault {
    private static final String DEFAULT_MESSAGE = "Usage of empty string for name or surname is forbidden";
    protected String message;
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }

    public static EmptyStringFault defaultInstance() {
        EmptyStringFault fault = new EmptyStringFault();
        fault.message = DEFAULT_MESSAGE;
        return fault;
    }
}
