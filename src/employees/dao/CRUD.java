package employees.dao;

import employees.Employee;
import employees.enums.Departments;

public interface CRUD {
    void addEmployee(Employee employee);

    void deleteEmployee(int id);

    void changeSalary(String fullName, double salary);

    void changeDepartment(String fullName, Departments newDepartment);

    void changeDepartment(int id, Departments newDepartment);

    void indexSalary(double indexationCoefficient);

    void indexSalaryInDepartment(Departments department, double index);

    Employee findById(int id);

    Employee findByFullName(String fullName);

    Employee findBySalary(double salary);


}
