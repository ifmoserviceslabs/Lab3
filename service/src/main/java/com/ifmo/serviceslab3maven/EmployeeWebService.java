package com.ifmo.serviceslab3maven;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "EmployeeService")
public class EmployeeWebService {
    PostgreSQLDAO dao;
    
    public EmployeeWebService(){
        this.dao = new PostgreSQLDAO();
    }
    
    @WebMethod(operationName = "getEmployees")
    public List<Employee> getEmployees() {
        List<Employee> employees = dao.getEmployees();
        return employees;
    }
    
    @WebMethod(operationName = "filterEmployees")
    public List<Employee> filterEmployees(@WebParam(name = "name") String name, @WebParam(name = "surname") String surname, @WebParam(name = "age") int age, @WebParam(name = "city") String city, @WebParam(name = "department") int department) {
        List<Employee> employees = dao.filterEmployees(name, surname, age, city, department);
        return employees;
    }
    
    @WebMethod(operationName = "createEmployee")
    public int createEmployee(@WebParam(name = "name") String name, @WebParam(name = "surname") String surname, @WebParam(name = "age") int age, @WebParam(name = "city") String city, @WebParam(name = "department") int department) throws EmptyStringException{
        return dao.createEmployee(name, surname, age, city, department);
    }

    @WebMethod(operationName = "updateEmployee")
    public String updateEmployee(@WebParam(name = "id") int id,
            @WebParam(name = "name") String name,
            @WebParam(name = "surname") String surname,
            @WebParam(name = "age") int age,
            @WebParam(name = "city") String city,
            @WebParam(name = "department") int department) throws IllegalIDException{
        return dao.updateEmployee(id, name, surname, age, city, department);
    }

    @WebMethod(operationName = "deleteEmployee")
    public String deleteEmployee(@WebParam(name = "id") int id) throws IllegalIDException {
        return dao.deleteEmployee(id);
    }
}