
package com.ifmo.serviceslab3client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ifmo.serviceslab3maven package. 
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

    private final static QName _FilterEmployeesResponse_QNAME = new QName("http://serviceslab3maven.ifmo.com/", "filterEmployeesResponse");
    private final static QName _GetEmployees_QNAME = new QName("http://serviceslab3maven.ifmo.com/", "getEmployees");
    private final static QName _CreateEmployeeResponse_QNAME = new QName("http://serviceslab3maven.ifmo.com/", "createEmployeeResponse");
    private final static QName _FilterEmployees_QNAME = new QName("http://serviceslab3maven.ifmo.com/", "filterEmployees");
    private final static QName _CreateEmployee_QNAME = new QName("http://serviceslab3maven.ifmo.com/", "createEmployee");
    private final static QName _DeleteEmployee_QNAME = new QName("http://serviceslab3maven.ifmo.com/", "deleteEmployee");
    private final static QName _UpdateEmployeeResponse_QNAME = new QName("http://serviceslab3maven.ifmo.com/", "updateEmployeeResponse");
    private final static QName _GetEmployeesResponse_QNAME = new QName("http://serviceslab3maven.ifmo.com/", "getEmployeesResponse");
    private final static QName _EmptyStringException_QNAME = new QName("http://serviceslab3maven.ifmo.com/", "EmptyStringException");
    private final static QName _DeleteEmployeeResponse_QNAME = new QName("http://serviceslab3maven.ifmo.com/", "deleteEmployeeResponse");
    private final static QName _IllegalIDException_QNAME = new QName("http://serviceslab3maven.ifmo.com/", "IllegalIDException");
    private final static QName _UpdateEmployee_QNAME = new QName("http://serviceslab3maven.ifmo.com/", "updateEmployee");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ifmo.serviceslab3maven
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmptyStringFault }
     * 
     */
    public EmptyStringFault createEmptyStringFault() {
        return new EmptyStringFault();
    }

    /**
     * Create an instance of {@link DeleteEmployeeResponse }
     * 
     */
    public DeleteEmployeeResponse createDeleteEmployeeResponse() {
        return new DeleteEmployeeResponse();
    }

    /**
     * Create an instance of {@link IllegalIDFault }
     * 
     */
    public IllegalIDFault createIllegalIDFault() {
        return new IllegalIDFault();
    }

    /**
     * Create an instance of {@link UpdateEmployee }
     * 
     */
    public UpdateEmployee createUpdateEmployee() {
        return new UpdateEmployee();
    }

    /**
     * Create an instance of {@link FilterEmployeesResponse }
     * 
     */
    public FilterEmployeesResponse createFilterEmployeesResponse() {
        return new FilterEmployeesResponse();
    }

    /**
     * Create an instance of {@link GetEmployees }
     * 
     */
    public GetEmployees createGetEmployees() {
        return new GetEmployees();
    }

    /**
     * Create an instance of {@link CreateEmployeeResponse }
     * 
     */
    public CreateEmployeeResponse createCreateEmployeeResponse() {
        return new CreateEmployeeResponse();
    }

    /**
     * Create an instance of {@link FilterEmployees }
     * 
     */
    public FilterEmployees createFilterEmployees() {
        return new FilterEmployees();
    }

    /**
     * Create an instance of {@link CreateEmployee }
     * 
     */
    public CreateEmployee createCreateEmployee() {
        return new CreateEmployee();
    }

    /**
     * Create an instance of {@link DeleteEmployee }
     * 
     */
    public DeleteEmployee createDeleteEmployee() {
        return new DeleteEmployee();
    }

    /**
     * Create an instance of {@link UpdateEmployeeResponse }
     * 
     */
    public UpdateEmployeeResponse createUpdateEmployeeResponse() {
        return new UpdateEmployeeResponse();
    }

    /**
     * Create an instance of {@link GetEmployeesResponse }
     * 
     */
    public GetEmployeesResponse createGetEmployeesResponse() {
        return new GetEmployeesResponse();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterEmployeesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceslab3maven.ifmo.com/", name = "filterEmployeesResponse")
    public JAXBElement<FilterEmployeesResponse> createFilterEmployeesResponse(FilterEmployeesResponse value) {
        return new JAXBElement<FilterEmployeesResponse>(_FilterEmployeesResponse_QNAME, FilterEmployeesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployees }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceslab3maven.ifmo.com/", name = "getEmployees")
    public JAXBElement<GetEmployees> createGetEmployees(GetEmployees value) {
        return new JAXBElement<GetEmployees>(_GetEmployees_QNAME, GetEmployees.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceslab3maven.ifmo.com/", name = "createEmployeeResponse")
    public JAXBElement<CreateEmployeeResponse> createCreateEmployeeResponse(CreateEmployeeResponse value) {
        return new JAXBElement<CreateEmployeeResponse>(_CreateEmployeeResponse_QNAME, CreateEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterEmployees }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceslab3maven.ifmo.com/", name = "filterEmployees")
    public JAXBElement<FilterEmployees> createFilterEmployees(FilterEmployees value) {
        return new JAXBElement<FilterEmployees>(_FilterEmployees_QNAME, FilterEmployees.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceslab3maven.ifmo.com/", name = "createEmployee")
    public JAXBElement<CreateEmployee> createCreateEmployee(CreateEmployee value) {
        return new JAXBElement<CreateEmployee>(_CreateEmployee_QNAME, CreateEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceslab3maven.ifmo.com/", name = "deleteEmployee")
    public JAXBElement<DeleteEmployee> createDeleteEmployee(DeleteEmployee value) {
        return new JAXBElement<DeleteEmployee>(_DeleteEmployee_QNAME, DeleteEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceslab3maven.ifmo.com/", name = "updateEmployeeResponse")
    public JAXBElement<UpdateEmployeeResponse> createUpdateEmployeeResponse(UpdateEmployeeResponse value) {
        return new JAXBElement<UpdateEmployeeResponse>(_UpdateEmployeeResponse_QNAME, UpdateEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceslab3maven.ifmo.com/", name = "getEmployeesResponse")
    public JAXBElement<GetEmployeesResponse> createGetEmployeesResponse(GetEmployeesResponse value) {
        return new JAXBElement<GetEmployeesResponse>(_GetEmployeesResponse_QNAME, GetEmployeesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyStringFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceslab3maven.ifmo.com/", name = "EmptyStringException")
    public JAXBElement<EmptyStringFault> createEmptyStringException(EmptyStringFault value) {
        return new JAXBElement<EmptyStringFault>(_EmptyStringException_QNAME, EmptyStringFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceslab3maven.ifmo.com/", name = "deleteEmployeeResponse")
    public JAXBElement<DeleteEmployeeResponse> createDeleteEmployeeResponse(DeleteEmployeeResponse value) {
        return new JAXBElement<DeleteEmployeeResponse>(_DeleteEmployeeResponse_QNAME, DeleteEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IllegalIDFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceslab3maven.ifmo.com/", name = "IllegalIDException")
    public JAXBElement<IllegalIDFault> createIllegalIDException(IllegalIDFault value) {
        return new JAXBElement<IllegalIDFault>(_IllegalIDException_QNAME, IllegalIDFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceslab3maven.ifmo.com/", name = "updateEmployee")
    public JAXBElement<UpdateEmployee> createUpdateEmployee(UpdateEmployee value) {
        return new JAXBElement<UpdateEmployee>(_UpdateEmployee_QNAME, UpdateEmployee.class, null, value);
    }

}
