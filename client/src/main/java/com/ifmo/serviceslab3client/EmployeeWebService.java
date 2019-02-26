
package com.ifmo.serviceslab3client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EmployeeWebService", targetNamespace = "http://serviceslab3maven.ifmo.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmployeeWebService {


    /**
     * 
     * @return
     *     returns java.util.List<com.ifmo.serviceslab3maven.Employee>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEmployees", targetNamespace = "http://serviceslab3maven.ifmo.com/", className = "com.ifmo.serviceslab3maven.GetEmployees")
    @ResponseWrapper(localName = "getEmployeesResponse", targetNamespace = "http://serviceslab3maven.ifmo.com/", className = "com.ifmo.serviceslab3maven.GetEmployeesResponse")
    public List<Employee> getEmployees();

    /**
     * 
     * @param city
     * @param surname
     * @param name
     * @param department
     * @param age
     * @return
     *     returns java.util.List<com.ifmo.serviceslab3maven.Employee>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "filterEmployees", targetNamespace = "http://serviceslab3maven.ifmo.com/", className = "com.ifmo.serviceslab3maven.FilterEmployees")
    @ResponseWrapper(localName = "filterEmployeesResponse", targetNamespace = "http://serviceslab3maven.ifmo.com/", className = "com.ifmo.serviceslab3maven.FilterEmployeesResponse")
    public List<Employee> filterEmployees(
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "surname", targetNamespace = "")
        String surname,
        @WebParam(name = "age", targetNamespace = "")
        int age,
        @WebParam(name = "city", targetNamespace = "")
        String city,
        @WebParam(name = "department", targetNamespace = "")
        int department);

    /**
     * 
     * @param city
     * @param surname
     * @param name
     * @param department
     * @param age
     * @return
     *     returns int
     * @throws EmptyStringException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createEmployee", targetNamespace = "http://serviceslab3maven.ifmo.com/", className = "com.ifmo.serviceslab3maven.CreateEmployee")
    @ResponseWrapper(localName = "createEmployeeResponse", targetNamespace = "http://serviceslab3maven.ifmo.com/", className = "com.ifmo.serviceslab3maven.CreateEmployeeResponse")
    public int createEmployee(
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "surname", targetNamespace = "")
        String surname,
        @WebParam(name = "age", targetNamespace = "")
        int age,
        @WebParam(name = "city", targetNamespace = "")
        String city,
        @WebParam(name = "department", targetNamespace = "")
        int department)
        throws EmptyStringException
    ;

    /**
     * 
     * @param city
     * @param surname
     * @param name
     * @param id
     * @param department
     * @param age
     * @return
     *     returns java.lang.String
     * @throws IllegalIDException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateEmployee", targetNamespace = "http://serviceslab3maven.ifmo.com/", className = "com.ifmo.serviceslab3maven.UpdateEmployee")
    @ResponseWrapper(localName = "updateEmployeeResponse", targetNamespace = "http://serviceslab3maven.ifmo.com/", className = "com.ifmo.serviceslab3maven.UpdateEmployeeResponse")
    public String updateEmployee(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "surname", targetNamespace = "")
        String surname,
        @WebParam(name = "age", targetNamespace = "")
        int age,
        @WebParam(name = "city", targetNamespace = "")
        String city,
        @WebParam(name = "department", targetNamespace = "")
        int department)
        throws IllegalIDException
    ;

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     * @throws IllegalIDException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteEmployee", targetNamespace = "http://serviceslab3maven.ifmo.com/", className = "com.ifmo.serviceslab3maven.DeleteEmployee")
    @ResponseWrapper(localName = "deleteEmployeeResponse", targetNamespace = "http://serviceslab3maven.ifmo.com/", className = "com.ifmo.serviceslab3maven.DeleteEmployeeResponse")
    public String deleteEmployee(
        @WebParam(name = "id", targetNamespace = "")
        int id)
        throws IllegalIDException
    ;

}