package employees;

import employees.enums.Departments;

public class Employee {
    private String fullName;
    private Departments department;
    private double salary;
    private int id;
    private static int counter = 1;

    public Employee() {

    }

    public Employee(String fullName, Departments department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFullName() {
        return this.fullName;
    }

    public Departments getDepartment() {
        return department;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setSalary (double salary) {
        this.salary = salary;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    public String toString () {
        return "ФИО - " + this.fullName + "\nОтдел - " + this.department + "\nЗарплата - " + this.salary + "\nid - " + this.id;
    }

}








