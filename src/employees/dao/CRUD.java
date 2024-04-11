package employees.dao;

import employees.Employee;

public interface CRUD {
    void addEmployee(String fullName, String department, double salary);

    void deleteEmployee(String fullName);

    void deleteEmployee(String fullName, int id);

    void changeSalary(String fullName, double salary);

    void changeDepartment(String fullName, String newDepartment);

    void changeDepartment(int id, String newDepartment);

    void changeDepartment(String fullName, int id, String newDepartment);

    void indexSalary(double indexationCoefficient);

    void indexSalaryInDepartment(String department, double index);

    Employee findById(int id);


}
