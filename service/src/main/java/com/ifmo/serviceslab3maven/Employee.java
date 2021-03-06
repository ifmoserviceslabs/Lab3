package com.ifmo.serviceslab3maven;

public class Employee {
    private String name;
    private String surname;
    private int age;
    private String city;
    private int department;
    
    public Employee() {
    }
    
    public Employee(String name, String surname, int age, String city, int department) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
        this.department = department;    
    }
    
    public String getName() {
        return name;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getCity() {
        return city;
    }
    
    public int getDepartment() {
        return department;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public void setDepartment(int department) {
        this.age = department;
    }
    
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", surname=" + surname + ", age=" + age + '}';
    }
}
