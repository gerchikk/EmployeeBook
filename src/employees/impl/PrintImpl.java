package employees.impl;

import employees.Employee;
import employees.EmployeeBook;
import employees.dao.Print;
import employees.enums.Departments;

public class PrintImpl implements Print {
    private Employee[] employees;
    private EmployeeBook employeeBook;

    public PrintImpl(Employee[] employees, EmployeeBook employeeBook) {
        this.employees = employees;
        this.employeeBook = employeeBook;
    }

    @Override
    public void devireFullName () {
        int i = 0;
        while (i < employees.length) {
            System.out.println("ФИО сотрудника - " + employees[i].getFullName());
            i++;
        }
    }

    @Override
    public void printEmployeeDepartment (Departments department) {
        System.out.println("Список сотрудников отдела " + department + ":");
        for (Employee e : employees) {
            if (e != null && e.getDepartment().equals(department)) {
                String employee = "ФИО - " + e.getFullName() + "\nЗарплата - " + e.getSalary() + "\nId - " + e.getId();
                System.out.println(employee);
            }
        }
    }

    @Override
    public void printInfoEmployee(String fullName) {
        for (Employee e : employees) {
            if (e != null && e.getFullName().equals(fullName)) {
                String employee = "ФИО - " + e.getFullName() + "\nЗарплата - " + e.getSalary() + "\nId - " + e.getId();
                System.out.println(employee);
            }
        }

    }

    @Override
    public void printAllEmployees () {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}
