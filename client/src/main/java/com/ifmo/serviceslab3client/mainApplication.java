package com.ifmo.serviceslab3client;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class mainApplication {
    public static void printEmployee(Employee employee){
        System.out.println("name: " + employee.getName() + ", surname: " + employee.getSurname() + ", age: " + employee.getAge() + ", city: " + employee.getCity() + ", department: " + employee.getDepartment());
    }
    
    public static void listEmployees(EmployeeWebService port){
        System.out.println("Employees list:");
        List<Employee> employees = port.getEmployees();
        for(Employee employee : employees){
            printEmployee(employee);
        }
        System.out.println("Total employees: " + employees.size());
    }
    
    public static void filterEmployees(EmployeeWebService port, String name, String surname, int age, String city, int department){
        List<Employee> employees = port.filterEmployees(name, surname, age, city, department);
        for(Employee employee : employees){
            printEmployee(employee);
        }
        System.out.println("Total employees: " + employees.size());
    }
    
    public static int createEmployee(EmployeeWebService port, String name, String surname, int age, String city, int department){
        System.out.println("Creation of new employee:");
        try {
            int id = port.createEmployee(name, surname, age, city, department);
            System.out.println("ID: " + id);
            return id;
        } catch(EmptyStringException ex) {
            System.out.println("Error on creation of new employee:" + ex);
            return 0;
        }
    }
    
    public static void updateEmployee(EmployeeWebService port, int id, String name, String surname, int age, String city, int department){
        System.out.println("Updating of given employee:");
        try {
            String response = port.updateEmployee(id, name, surname, age, city, department);
            System.out.println("Response: " + response);
        } catch(IllegalIDException ex) {
            System.out.println("Error on updating of employee:" + ex);
        }
    }
    
    public static void deleteEmployee(EmployeeWebService port, int id){
        System.out.println("Removing of given employee:");
        try {
            String response = port.deleteEmployee(id);
            System.out.println("Response: " + response);
        } catch(IllegalIDException ex) {
            System.out.println("Error on deleting of employee:" + ex);
        }
    }
    
    
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/EmployeeService?wsdl");
        EmployeeService employeeService = new EmployeeService(url);
        EmployeeWebService port = employeeService.getEmployeeWebServicePort();
        listEmployees(port);
        
        System.out.println("Filtering by name");
        filterEmployees(port, "Иван", "", 0, "", 0);
        System.out.println("Filtering by age");
        filterEmployees(port, "", "", 32, "", 0);
        System.out.println("Filtering by department");
        filterEmployees(port, "", "", 0, "", 2);
        System.out.println("Filtering by age and department");
        filterEmployees(port, "", "", 32, "", 2);
        
        int id = createEmployee(port, "testName", "testSurname", 21, "City", 1);
        updateEmployee(port, id, "UpdatedName", "UpdatedSurname", 42, "UpdatedCity", 52);
        filterEmployees(port, "UpdatedName", "UpdatedSurname", 42, "UpdatedCity", 52);
        deleteEmployee(port, id);
        
        System.out.println("Errors demo:");
        createEmployee(port, "", "", 21, "City", 1);
        updateEmployee(port, 0, "UpdatedName", "UpdatedSurname", 42, "UpdatedCity", 52);
        deleteEmployee(port, 0);
    }
}