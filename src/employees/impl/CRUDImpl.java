package employees.impl;

import employees.Employee;
import employees.EmployeeBook;
import employees.dao.CRUD;
import employees.enums.Departments;

public class CRUDImpl implements CRUD {
    private Employee[] employees;
    private EmployeeBook employeeBook;

    public CRUDImpl(Employee[] employees, EmployeeBook employeeBook) {
        this.employees = employees;
        this.employeeBook = employeeBook;
    }

    @Override
    public void addEmployee(Employee employee) {
        if (employeeBook.getSizeArr() == 10) {
            System.out.println("Невозможно добавить сотрудника! Книга заполнена!");
            return;
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                employeeBook.upSize();
                break;
            }

        }
    }


    @Override
    public void deleteEmployee(int id) {
        if (employeeBook.getSizeArr() == 0) {
            return;
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                employeeBook.downSize();
                break;
            }
        }
    }

    @Override
    public void changeSalary(String fullName, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(fullName)) {
                employees[i].setSalary(salary);
            }
        }
    }

    @Override
    public void changeDepartment(String fullName, Departments newDepartment) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(fullName)) {
                employees[i].setDepartment(newDepartment);
            }
        }
    }

    @Override
    public void changeDepartment(int id, Departments newDepartment) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i].setDepartment(newDepartment);
            }
        }
    }

    @Override
    public void indexSalary(double indexationCoefficient) {
        for (Employee e : employees) {
            if (e != null) {
                double newSalary = e.getSalary() * (1 + indexationCoefficient / 100);
                e.setSalary(newSalary);
            }
        }
    }

    @Override
    public void indexSalaryInDepartment(Departments department, double index) {
        double newSalary = 0.0;
        for (Employee e : employees) {
            if (e != null && e.getDepartment().equals(department)) {
                newSalary = e.getSalary() * (1 + index / 100);
                e.setSalary(newSalary);
            }
        }
    }

    @Override
    public Employee findById(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                return employees[i];
            }
        }
        return new Employee();
    }

    @Override
    public Employee findByFullName(String fullName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(fullName)) {
                return employees[i];
            }
        }
        return new Employee();
    }

    @Override
    public Employee findBySalary(double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() == salary) {
                return employees[i];
            }
        }
        return new Employee();
    }
}
