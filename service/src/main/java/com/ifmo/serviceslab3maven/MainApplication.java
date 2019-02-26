package com.ifmo.serviceslab3maven;
import javax.xml.ws.Endpoint;

public class MainApplication {
    public static void main(String[] args) {
        System.setProperty("com.sun.xml.ws.fault.SOAPFaultBuilder.disableCaptureStackTrace", "false");
        String url = "http://0.0.0.0:8080/EmployeeService";
        Endpoint.publish(url, new EmployeeWebService());
    }
}