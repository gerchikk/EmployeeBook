package employees.dao;

import employees.Employee;
import employees.enums.Departments;

public interface Print {
    void devireFullName();
    void printEmployeeDepartment(Departments department);

    void printInfoEmployee(String fullName);

    void printAllEmployees();



}
