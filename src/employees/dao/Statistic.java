package employees.dao;

import employees.Employee;
import employees.enums.Departments;

public interface Statistic {
    double sumSalary();
    Employee minSalary();
    Employee maxSalary();

    double avgSalary();

    String minSalaryInDepartment(Departments department);

    String maxSalaryInDepartment(Departments department);

    double sumSalaryInDepartment(Departments department);

    double avgSalaryInDepartment(Departments department);

    void findEmployeeWithSalaryLessThan(double salary);

    void findEmployeeWithSalaryGreaterThan(double salary);
}
